package com.sdk4.jinritemai.model.request;

import com.sdk4.jinritemai.DoudianRequest;
import com.sdk4.jinritemai.model.response.DoudianOrderAddressConfirmResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoudianOrderAddressConfirmRequest implements DoudianRequest<DoudianOrderAddressConfirmResponse> {
    private final String method = "order.addressConfirm";

    /**
     * 主订单id，注意请求时order/list或 order/detail中返回的主订单id带的‘A’需要截断掉
     */
    private String orderId;
    /**
     * 0:同意;
     * 拒绝需要传入以下参数： 1001:订单已进入拣货环节 1002:订单已进入配货环节 1003:订单已进入仓库环节 1004:订单已进入出库环节 1005:订单已进入发货环节
     */
    private Integer isApproved;

    @Override
    public Class<DoudianOrderAddressConfirmResponse> getResponseClass() {
        return DoudianOrderAddressConfirmResponse.class;
    }
}
