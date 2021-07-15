package com.sdk4.jinritemai.model.request;

import com.sdk4.jinritemai.DoudianRequest;
import com.sdk4.jinritemai.model.response.DoudianShopOrderDetailResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoudianShopOrderDetailRequest implements DoudianRequest<DoudianShopOrderDetailResponse> {
    private final String method = "order.orderDetail";

    /**
     * 店铺订单号 入参的订单号不要带后缀A了 4782860977949521619
     */
    private String shopOrderId;

    /**
     * 密文是否可搜索
     */
    private Boolean isSearchable;

    @Override
    public Class<DoudianShopOrderDetailResponse> getResponseClass() {
        return DoudianShopOrderDetailResponse.class;
    }
}
