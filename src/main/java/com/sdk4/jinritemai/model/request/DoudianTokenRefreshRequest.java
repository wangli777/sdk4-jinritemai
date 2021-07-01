package com.sdk4.jinritemai.model.request;

import com.sdk4.jinritemai.DoudianRequest;
import com.sdk4.jinritemai.model.response.DoudianTokenRefreshResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoudianTokenRefreshRequest implements DoudianRequest<DoudianTokenRefreshResponse> {
    private final String method = "token.refresh";

    /**
     * 用于刷新access_token的刷新令牌
     */
    private String refreshToken;

    /**
     * "grant_type":"refresh_token"
     */
    private String grantType = "refresh_token";


    @Override
    public Class<DoudianTokenRefreshResponse> getResponseClass() {
        return DoudianTokenRefreshResponse.class;
    }
}
