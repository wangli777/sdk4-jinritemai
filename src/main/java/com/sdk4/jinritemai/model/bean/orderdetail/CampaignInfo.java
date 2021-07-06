package com.sdk4.jinritemai.model.bean.orderdetail;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bg395819
 * @date 21/4/19 18:14
 * @description
 */
@NoArgsConstructor
@Data
public class CampaignInfo {
    /**
     * campaign_id : 4781320682406084000
     * campaign_type : 7
     * share_discount_cost : {"platform_cost":100,"shop_cost":100}
     * campaign_name : XXX活动
     * campaign_amount : 200
     * campaign_sub_type : 1
     */

    private Long campaignId;
    private Integer campaignType;
    private ShareDiscountCost shareDiscountCost;
    private String campaignName;
    private Long campaignAmount;
    private Integer campaignSubType;
}
