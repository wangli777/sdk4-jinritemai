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
public class PostAddr {
    /**
     * province : {"name":"北京市","id":"110000"}
     * city : {"name":"市辖区","id":"110000"}
     * town : {"name":"海淀区","id":"110000"}
     * street : {"name":"中关村街道","id":"110000"}
     * detail : 丹棱街1号
     */

    private DouyinAddress province;
    private DouyinAddress city;
    private DouyinAddress town;
    private DouyinAddress street;
    private String detail;

    @NoArgsConstructor
    @Data
    public static class DouyinAddress {
        /**
         * name : 北京市
         * id : 110000
         */

        private String name;
        private String id;
    }
}
