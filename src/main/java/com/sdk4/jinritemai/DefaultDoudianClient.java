package com.sdk4.jinritemai;

import com.alibaba.fastjson.JSON;
import com.sdk4.jinritemai.exception.ApiException;
import com.sdk4.jinritemai.model.bean.DoudianAccessToken;
import com.sdk4.jinritemai.model.request.DoudianTokenCreateRequest;
import com.sdk4.jinritemai.model.request.DoudianTokenRefreshRequest;
import com.sdk4.jinritemai.model.response.DoudianAccessTokenResponse;
import com.sdk4.jinritemai.util.DoudianUtils;
import com.sdk4.jinritemai.util.WebUtils;
import com.sdk4.jinritemai.util.WebUtils.HttpResponseData;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class DefaultDoudianClient implements DoudianClient {
    protected String serverUrl;
    protected String appKey;
    protected String appSecret;
    protected String signMethod;
    protected int connectTimeout;
    protected int readTimeout;
    private String version;
    DoudianAccessToken accessToken;

    public static final String LOG_NAME = "===DefaultDoudianClient=== ";

    public DefaultDoudianClient(String serverUrl, String appKey, String appSecret) {
        this.signMethod = "hmac-sha256";
        this.connectTimeout = 15000;
        this.readTimeout = 30000;
        this.version = "2";
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.serverUrl = serverUrl;
    }

    @Override
    public void setAccessToken(DoudianAccessToken accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public DoudianAccessToken getAccessToken() {
//        /token/create?app_key=your_app_key_here&method=token.create&param_json={"code":"","grant_type":"authorization_self","shop_id":"12312312"}&timestamp=2018-06-14%2016:06:59&v=2&sign=your_sign_here
        DoudianTokenCreateRequest request = new DoudianTokenCreateRequest();
        request.setGrantType("authorization_self");
        request.setCode("");

        return createAccessToken(request);
    }

//    @Override
//    public DoudianAccessToken getAccessToken(String refreshToken) {
//        String url = String.format("%s/oauth2/refresh_token?app_id=%s&app_secret=%s&grant_type=refresh_token&refresh_token=%s",
//                serverUrl,
//                appKey,
//                appSecret,
//                refreshToken);
//        return createAccessToken(url);
//    }
//
//    @Override
//    public DoudianAccessToken codeToToken(String code) {
//        String url = String.format("%s/oauth2/access_token?app_id=%s&app_secret=%s&code=%s&grant_type=authorization_code",
//                serverUrl,
//                appKey,
//                appSecret,
//                code);
//        return createAccessToken(url);
//    }

    /**
     * 通过refreshToken刷新accesstoken
     * 新版 获取accesstoken 方式
     *
     * @param refreshToken
     * @return
     */
    @Override
    public DoudianAccessToken getAccessToken(String refreshToken) {
        DoudianTokenRefreshRequest request = new DoudianTokenRefreshRequest();
        request.setRefreshToken(refreshToken);
        return createAccessToken(request);
    }

    /**
     * 通过授权code获取accesstoken
     * 新版 获取accesstoken 方式
     *
     * @param code
     * @return
     */
    @Override
    public DoudianAccessToken codeToToken(String code) {
        DoudianTokenCreateRequest request = new DoudianTokenCreateRequest();
        request.setCode(code);
        return createAccessToken(request);
    }

    DoudianAccessToken createAccessToken(DoudianRequest request) {
        DoudianAccessToken accessToken;
        try {
            DoudianResponse response = executeWithOutToken(request);
            if (response.isSuccess()) {
                accessToken = (DoudianAccessToken) response.getData();
                if (accessToken.getExpiresIn() != null) {
                    accessToken.setExpire(System.currentTimeMillis() + (accessToken.getExpiresIn() * 1000) - 60000);
                }
            } else {
                accessToken = new DoudianAccessToken();
                accessToken.setError(DoudianUtils.isEmpty(response.getMessage()) ? response.getErrNo() + "" : response.getMessage());
            }
        } catch (ApiException e) {
            accessToken = new DoudianAccessToken();
            accessToken.setError("获取accessToken失败");
            accessToken.setException(e);
        }
        return accessToken;
    }

    DoudianAccessToken createAccessToken(String url) {
        DoudianAccessToken accessToken;
        try {
            HttpResponseData data = WebUtils.doPost(url, new HashMap<>(0), "UTF-8", connectTimeout, readTimeout);
            DoudianAccessTokenResponse response = JSON.parseObject(data.getBody(), DoudianAccessTokenResponse.class);
            if (response.isSuccess()) {
                accessToken = response.getData();
                if (accessToken.getExpiresIn() != null) {
                    accessToken.setExpire(System.currentTimeMillis() + (accessToken.getExpiresIn() * 1000) - 60000);
                }
            } else {
                accessToken = new DoudianAccessToken();
                accessToken.setError(DoudianUtils.isEmpty(response.getMessage()) ? response.getErrNo() + "" : response.getMessage());
            }
        } catch (IOException e) {
            accessToken = new DoudianAccessToken();
            accessToken.setError("获取accessToken失败");
            accessToken.setException(e);
        }
        return accessToken;
    }

    @Override
    public <T extends DoudianResponse> T executeWithOutToken(DoudianRequest<T> request) throws ApiException {
        String paramJson = DoudianUtils.createParamJson(request);

        Map<String, String> params = new HashMap<>();
        params.put("method", request.getMethod());
        params.put("app_key", appKey);
        params.put("param_json", paramJson);
        params.put("timestamp", DoudianUtils.getTimeString(new Date()));
        params.put("v", version);

        try {
            params.put("sign", DoudianUtils.signTopRequest(params, appSecret, signMethod));
            params.put("sign_method", signMethod);

            String url = createUrl(serverUrl, request.getMethod());
            String query = WebUtils.buildQuery(params, "UTF-8");
            String fullUrl = WebUtils.buildRequestUrl(url, query);
            HttpResponseData data = WebUtils.doPost(fullUrl, new HashMap<>(0), "UTF-8", connectTimeout, readTimeout);
            return JSON.parseObject(data.getBody(), request.getResponseClass());
        } catch (IOException e) {
            throw new ApiException("API_CALL_ERROR", "接口调用失败", e);
        }
    }


    @Override
    public <T extends DoudianResponse> T execute(DoudianRequest<T> request) throws ApiException {
        if (accessToken == null) {
            accessToken = getAccessToken();
        }
        if (!accessToken.isValid()) {
            accessToken = DoudianUtils.isEmpty(accessToken.getRefreshToken()) ? getAccessToken() : getAccessToken(accessToken.getRefreshToken());
        }
        if (!accessToken.isValid()) {
            try {
                T response = request.getResponseClass().newInstance();
                response.setErrNo(4444);
                response.setMessage("access token is invalid");
            } catch (Exception e) {
                throw new ApiException("API_CALL_ERROR", "接口调用失败", e);
            }
        }
        return execute(request, accessToken.getAccessToken());
    }

    @Override
    public <T extends DoudianResponse> T execute(DoudianRequest<T> request, String accessToken) throws ApiException {
        String paramJson = DoudianUtils.createParamJson(request);

        Map<String, String> params = new HashMap<>();
        params.put("method", request.getMethod());
        params.put("app_key", appKey);
        params.put("param_json", paramJson);
        params.put("timestamp", DoudianUtils.getTimeString(new Date()));
        params.put("v", version);

        try {
            params.put("sign", DoudianUtils.signTopRequest(params, appSecret, signMethod));
            params.put("sign_method", signMethod);
            params.put("access_token", accessToken);

            String url = createUrl(serverUrl, request.getMethod());
            String query = WebUtils.buildQuery(params, "UTF-8");
            String fullUrl = WebUtils.buildRequestUrl(url, query);
            HttpResponseData data = WebUtils.doPost(fullUrl, new HashMap<>(0), "UTF-8", connectTimeout, readTimeout);
//            log.warn("{} execute fullUrl:{}", LOG_NAME, fullUrl);
            System.out.println(fullUrl);
            log.warn("{} execute data:{}", LOG_NAME, data.getBody());
            return JSON.parseObject(data.getBody(), request.getResponseClass());
        } catch (IOException e) {
            throw new ApiException("API_CALL_ERROR", "接口调用失败", e);
        }
    }

    static String createUrl(String baseUrl, String method) {
        StringBuilder url = new StringBuilder();
        if (DoudianUtils.isNotEmpty(baseUrl)) {
            url.append(baseUrl);
            if (!baseUrl.endsWith("/")) {
                url.append('/');
            }
        }
        if (DoudianUtils.isNotEmpty(method)) {
            url.append(method.replace('.', '/'));
        }
        return url.toString();
    }

}
