package com.sdk4.jinritemai.model.request;

import com.sdk4.jinritemai.DoudianRequest;
import com.sdk4.jinritemai.model.response.DoudianOrderAddressAppliedSwitchResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoudianOrderAddressAppliedSwitchRequest implements DoudianRequest<DoudianOrderAddressAppliedSwitchResponse> {
    private final String method = "order.AddressAppliedSwitch";

    /**
     * 0代表关闭，不需要审核 1代表开启审核，买家变更需要审核
     */
    private Integer isAllowed;

    @Override
    public Class<DoudianOrderAddressAppliedSwitchResponse> getResponseClass() {
        return DoudianOrderAddressAppliedSwitchResponse.class;
    }
}
