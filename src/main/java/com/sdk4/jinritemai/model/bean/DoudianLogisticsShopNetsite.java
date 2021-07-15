package com.sdk4.jinritemai.model.bean;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Data
@Getter
@Setter
public class DoudianLogisticsShopNetsite {

    /**
     * netsites : [{"netsite_code":"100010","netsite_name":"E世界","amount":"1","sender_address":[{"province_name":"北京","city_name":"北京市","district_name":"海淀区","street_name":"E世界","detail_address":"E世界"}],"allocated_quantity":1,"cancelled_quantity":1,"recycled_quantity":1,"company":"zhongtong","company_type":1}]
     * logistics_code : zhongtong
     * company_type : 1
     */

    /**
     * 快递公司编码 zhongtong
     */
    private String logisticsCode;
    /**
     * 物流服务商业务类型 1：直营 2：加盟 3：落地配 4：直营带网点
     */
    private Integer companyType;
    /**
     * 商家已开通的网点列表信息
     */
    private List<Netsites> netsites;

    @NoArgsConstructor
    @Data
    public static class Netsites {
        /**
         * netsite_code : 100010
         * netsite_name : E世界
         * amount : 1
         * sender_address : [{"province_name":"北京","city_name":"北京市","district_name":"海淀区","street_name":"E世界","detail_address":"E世界"}]
         * allocated_quantity : 1
         * cancelled_quantity : 1
         * recycled_quantity : 1
         * company : zhongtong
         * company_type : 1
         */

        /**
         * 网点Code
         */
        private String netsiteCode;
        /**
         * 网点名称
         */
        private String netsiteName;
        /**
         * 电子面单余额数量
         */
        private String amount;
        /**
         * 已取单号数量，若业务本身无值，则传-1，前端可展示为“-”
         */
        private Integer allocatedQuantity;
        /**
         * 已取消单号数量，若业务本身无值，则传-1，前端可展示为“-”
         */
        private Integer cancelledQuantity;
        /**
         * 已回收单号数量，若业务本身无值，则传-1，前端可展示为“-”
         */
        private Integer recycledQuantity;
        /**
         * 快递公司编码 zhongtong
         */
        private String company;
        /**
         * 物流服务商业务类型 1：直营 2：加盟 3：落地配 4：直营带网点
         */
        private Integer companyType;
        /**
         * 寄件人地址
         */
        private List<SenderAddress> senderAddress;

        @NoArgsConstructor
        @Data
        public static class SenderAddress {
            /**
             * province_name : 北京
             * city_name : 北京市
             * district_name : 海淀区
             * street_name : E世界
             * detail_address : E世界
             */

            private String provinceName;
            private String cityName;
            private String districtName;
            private String streetName;
            private String detailAddress;
        }
    }
}
