package com.sdk4.jinritemai.model.request;

import com.sdk4.jinritemai.DoudianRequest;
import com.sdk4.jinritemai.model.response.DoudianTokenCreateResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoudianTokenCreateRequest implements DoudianRequest<DoudianTokenCreateResponse> {
    private final String method = "token.create";

    /**
     * 授权code
     */
    private String code;

    /**
     * "grant_type":"authorization_code"
     */
    private String grantType = "authorization_code";


    @Override
    public Class<DoudianTokenCreateResponse> getResponseClass() {
        return DoudianTokenCreateResponse.class;
    }
}
