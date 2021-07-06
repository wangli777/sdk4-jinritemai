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
public class CouponInfo {
    /**
     * coupon_id : 4781320682406
     * coupon_type : 1
     * coupon_meta_id : 43543523532
     * coupon_amount : 100
     * coupon_name : 优惠券
     */

    private Long couponId;
    private Integer couponType;
    private String couponMetaId;
    private Long couponAmount;
    private String couponName;
}
