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
public class ShareDiscountCost {
    /**
     * platform_cost : 100
     * shop_cost : 100
     */

    private Long platformCost;
    private Long shopCost;
}
