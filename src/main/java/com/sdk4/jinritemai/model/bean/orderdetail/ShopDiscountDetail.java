package com.sdk4.jinritemai.model.bean.orderdetail;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author bg395819
 * @date 21/4/19 18:14
 * @description
 */
@NoArgsConstructor
@Data
public class ShopDiscountDetail {
    /**
     * total_amount : 200
     * coupon_amount : 100
     * full_discount_amount : 100
     * coupon_info : [{"coupon_id":4781320682406,"coupon_type":1,"coupon_meta_id":"43543523532","coupon_amount":100,"coupon_name":"优惠券"}]
     * full_discount_info : [{"campaign_id":4781320682406084000,"campaign_type":7,"share_discount_cost":{"platform_cost":100,"shop_cost":100},"campaign_name":"XXX活动","campaign_amount":200,"campaign_sub_type":1}]
     */

    private Long totalAmount;
    private Long couponAmount;
    private Long fullDiscountAmount;
    private List<CouponInfo> couponInfo;
    private List<FullDiscountInfo> fullDiscountInfo;
}
