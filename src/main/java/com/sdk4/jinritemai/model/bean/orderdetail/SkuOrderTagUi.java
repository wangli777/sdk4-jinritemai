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
public class SkuOrderTagUi {
    /**
     * key : pre_sale_label
     * text : 全款预售
     * hover_text : 该商品需要送到质检中心，质检完成后发给用户
     * tag_type : orange
     * help_doc : https://school.jinritemai.com/doudian/web/article/101835?from=shop_article
     * sort : 1
     */

    private String key;
    private String text;
    private String hoverText;
    private String tagType;
    private String helpDoc;
    private Integer sort;
}
