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
public class ProductInfo {
    /**
     * product_name : 苹果
     * price : 1000
     * outer_sku_id : sdfa
     * sku_id : 3254535
     * sku_specs : [{"name":"颜色","value":"蓝"}]
     * product_count : 2
     * product_id : 3473196049974326300
     * sku_order_id : 4781320682406083640
     */

    private String productName;
    private Long price;
    private String outerSkuId;
    private Long skuId;
    private Integer productCount;
    private Long productId;
    private String skuOrderId;
    private List<SkuSpecs> skuSpecs;
}
