package com.sdk4.jinritemai.model.request;

import com.sdk4.jinritemai.DoudianRequest;
import com.sdk4.jinritemai.model.response.DoudianLogisticsListShopNetsiteResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * @author bg395819
 * @date 21/7/15 17:39
 * @description 查询商家和物流商的订购关系以及物流单号使用情况
 */
@Getter
@Setter
public class DoudianLogisticsListShopNetsiteRequest implements DoudianRequest<DoudianLogisticsListShopNetsiteResponse> {
    private final String method = "logistics.listShopNetsite";

    /**
     * 物流服务商编码（想获取全量物流，则传空字符串）
     */
    private String logisticsCode;


    @Override
    public Class<DoudianLogisticsListShopNetsiteResponse> getResponseClass() {
        return DoudianLogisticsListShopNetsiteResponse.class;
    }
}
