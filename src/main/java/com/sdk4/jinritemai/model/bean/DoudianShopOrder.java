package com.sdk4.jinritemai.model.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author bg395819
 * @date 21/7/7 14:31
 * @description
 */
@NoArgsConstructor
@Data
public class DoudianShopOrder {

    /**
     * shop_id : 77977
     * shop_name : 刘好好严选
     * open_id : 23431434
     * order_id : 4781320682406083640
     * order_level : 2
     * biz : 1
     * biz_desc : 鲁班
     * order_type : 0
     * order_type_desc : 普通订单
     * trade_type : 1
     * trade_type_desc : 拼团
     * order_status : 3
     * order_status_desc : 待支付
     * main_status : 103
     * main_status_desc : 部分支付
     * pay_time : 1617355413
     * order_expire_time : 1800
     * finish_time : 1617355413
     * create_time : 1617355413
     * update_time : 1617355413
     * cancel_reason : 不想要
     * buyer_words : 要xxx
     * seller_words : 注意XX
     * b_type : 1
     * b_type_desc : 抖音
     * sub_b_type : 1
     * sub_b_type_desc : 小程序
     * app_id : 43545454556
     * pay_type : 1
     * channel_payment_no : PAY234532534534
     * order_amount : 600
     * pay_amount : 500
     * post_amount : 10
     * post_insurance_amount : 10
     * modify_amount : -10
     * modify_post_amount : -1
     * promotion_amount : 1000
     * promotion_shop_amount : 100
     * promotion_platform_amount : 100
     * shop_cost_amount : 100
     * platform_cost_amount : 100
     * promotion_talent_amount : 100
     * promotion_pay_amount : 10
     * post_tel : 12345678911
     * post_receiver : 张三
     * post_addr : {"province":{"name":"北京市","id":"110000"},"city":{"name":"市辖区","id":"110000"},"town":{"name":"海淀区","id":"110000"},"street":{"name":"中关村街道","id":"110000"},"detail":"丹棱街1号"}
     * exp_ship_time : 1617355413
     * ship_time : 1617355413
     * logistics_info : [{"tracking_no":"3617355413","company":"shunfeng","ship_time":1617355413,"delivery_id":"shunfeng_3617355413","company_name":"顺丰","product_info":[{"product_name":"苹果","price":1000,"outer_sku_id":"sdfa","sku_id":3254535,"sku_specs":[{"name":"颜色","value":"蓝"}],"product_count":2,"product_id":3473196049974326300,"sku_order_id":"4781320682406083640"}]}]
     * sku_order_list : [{"order_id":"4781320682406083640","parent_order_id":"4781320682406083640","order_level":3,"biz":1,"biz_desc":"鲁班","order_type":0,"order_type_desc":"普通订单","trade_type":1,"trade_type_desc":"拼团","order_status":3,"order_status_desc":"待支付","main_status":103,"main_status_desc":"部分支付","pay_time":1617355413,"order_expire_time":1800,"finish_time":1617355413,"create_time":1617355413,"update_time":1617355413,"cancel_reason":"不想要","b_type":1,"b_type_desc":"抖音","sub_b_type":1,"sub_b_type_desc":"小程序","send_pay":1,"send_pay_desc":"鲁班广告","author_id":324234453,"author_name":"XXXX","theme_type":"1","theme_type_desc":"直播间","app_id":43545454556,"room_id":43545454556,"content_id":"43545454556","video_id":"43545454556","origin_id":"43545454556","cid":43545454556,"c_biz":1,"c_biz_desc":"鲁班广告","page_id":43545454556,"pay_type":1,"channel_payment_no":"PAY234532534534","order_amount":600,"pay_amount":500,"post_insurance_amount":10,"modify_amount":-10,"modify_post_amount":-1,"promotion_amount":1000,"promotion_shop_amount":100,"promotion_platform_amount":100,"shop_cost_amount":100,"platform_cost_amount":100,"promotion_talent_amount":100,"promotion_pay_amount":10,"code":"djfafj","post_tel":"12345678911","post_receiver":"张三","post_addr":{"province":{"name":"北京市","id":"110000"},"city":{"name":"市辖区","id":"110000"},"town":{"name":"海淀区","id":"110000"},"street":{"name":"中关村街道","id":"110000"},"detail":"丹棱街1号"},"exp_ship_time":1617355413,"ship_time":1617355413,"logistics_receipt_time":1617355413,"confirm_receipt_time":1617355413,"goods_type":1,"product_id":3473196049974326300,"sku_id":3254535,"spec":[{"name":"颜色","value":"蓝"}],"first_cid":20005,"second_cid":20174,"third_cid":20174,"fourth_cid":20174,"out_sku_id":"43564553","supplier_id":"fsgfgsdg","out_product_id":"432655662343","warehouse_ids":["49574835439","954764056"],"out_warehouse_ids":["49574835439","954764056"],"inventory_type":"2","inventory_type_desc":"普通库存","reduce_stock_type":1,"reduce_stock_type_desc":"下单减库存","origin_amount":100,"has_tax":true,"item_num":2,"sum_amount":200,"source_platform":"XXX","product_pic":"https:xxxxx","is_comment":1,"product_name":"衣服","inventory_list":[{"warehouse_id":"3141234234324","out_warehouse_id":"3254234234234","inventory_type":1,"inventory_type_desc":"普通库存","count":2}],"post_amount":1,"pre_sale_type":1,"after_sale_info":{"after_sale_status":6,"after_sale_type":1,"refund_status":1}}]
     * seller_remark_stars : 1
     * order_phase_list : [{"phase_order_id":"4781320682406083640","total_phase":2,"current_phase":1,"pay_success":true,"sku_order_id":"4781320682406083640","campaign_id":3214324342342,"phase_payable_price":100,"phase_pay_type":1,"phase_open_time":1617355413,"phase_pay_time":1617355413,"phase_close_time":1617355413,"channel_payment_no":"PAY34243247134325","phase_order_amount":100,"phase_sum_amount":100,"phase_post_amount":100,"phase_pay_amount":100,"phase_promotion_amount":100,"current_phase_status_desc":"已开始但未支付","sku_price":100}]
     * doudian_open_id : #zuLyd4U4J3p+czzXkwg+ZQ673h7KTcrKOddb5iPGAAE0K3MYJmgXEXof9LDtoScAfMKvdVRqpAL4CEI3SrLwYATIzTF9Qw==
     */

    private Long shopId;
    private String shopName;
    private String openId;
    private String orderId;
    private Long orderLevel;
    private Long biz;
    private String bizDesc;
    private Long orderType;
    private String orderTypeDesc;
    private Long tradeType;
    private String tradeTypeDesc;
    private Long orderStatus;
    private String orderStatusDesc;
    private Long mainStatus;
    private String mainStatusDesc;
    private Long payTime;
    private Long orderExpireTime;
    private Long finishTime;
    private Long createTime;
    private Long updateTime;
    private String cancelReason;
    private String buyerWords;
    private String sellerWords;
    private Long bType;
    private String bTypeDesc;
    private Long subBType;
    private String subBTypeDesc;
    private Long appId;
    private Long payType;
    private String channelPaymentNo;
    private Long orderAmount;
    private Long payAmount;
    private Long postAmount;
    private Long postInsuranceAmount;
    private Long modifyAmount;
    private Long modifyPostAmount;
    private Long promotionAmount;
    private Long promotionShopAmount;
    private Long promotionPlatformAmount;
    private Long shopCostAmount;
    private Long platformCostAmount;
    private Long promotionTalentAmount;
    private Long promotionPayAmount;
    private String postTel;
    private String postReceiver;
    private PostAddr postAddr;
    private Long expShipTime;
    private Long shipTime;
    private Long sellerRemarkStars;
    private String doudianOpenId;
    private List<LogisticsInfo> logisticsInfo;
    private List<DoudianShopOrderDetail.SkuOrderList> skuOrderList;
    private List<OrderPhaseList> orderPhaseList;

    @NoArgsConstructor
    @Data
    public static class PostAddr {
        /**
         * province : {"name":"北京市","id":"110000"}
         * city : {"name":"市辖区","id":"110000"}
         * town : {"name":"海淀区","id":"110000"}
         * street : {"name":"中关村街道","id":"110000"}
         * detail : 丹棱街1号
         */

        private Province province;
        private City city;
        private Town town;
        private Street street;
        private String detail;

        @NoArgsConstructor
        @Data
        public static class Province {
            /**
             * name : 北京市
             * id : 110000
             */

            private String name;
            private String id;
        }

        @NoArgsConstructor
        @Data
        public static class City {
            /**
             * name : 市辖区
             * id : 110000
             */

            private String name;
            private String id;
        }

        @NoArgsConstructor
        @Data
        public static class Town {
            /**
             * name : 海淀区
             * id : 110000
             */

            private String name;
            private String id;
        }

        @NoArgsConstructor
        @Data
        public static class Street {
            /**
             * name : 中关村街道
             * id : 110000
             */

            private String name;
            private String id;
        }
    }

    @NoArgsConstructor
    @Data
    public static class LogisticsInfo {
        /**
         * tracking_no : 3617355413
         * company : shunfeng
         * ship_time : 1617355413
         * delivery_id : shunfeng_3617355413
         * company_name : 顺丰
         * product_info : [{"product_name":"苹果","price":1000,"outer_sku_id":"sdfa","sku_id":3254535,"sku_specs":[{"name":"颜色","value":"蓝"}],"product_count":2,"product_id":3473196049974326300,"sku_order_id":"4781320682406083640"}]
         */

        private String trackingNo;
        private String company;
        private Long shipTime;
        private String deliveryId;
        private String companyName;
        private List<DoudianShopOrderDetail.LogisticsInfo.ProductInfo> productInfo;

    }

//    @NoArgsConstructor
//    @Data
//    public static class SkuOrderList {
//        /**
//         * order_id : 4781320682406083640
//         * parent_order_id : 4781320682406083640
//         * order_level : 3
//         * biz : 1
//         * biz_desc : 鲁班
//         * order_type : 0
//         * order_type_desc : 普通订单
//         * trade_type : 1
//         * trade_type_desc : 拼团
//         * order_status : 3
//         * order_status_desc : 待支付
//         * main_status : 103
//         * main_status_desc : 部分支付
//         * pay_time : 1617355413
//         * order_expire_time : 1800
//         * finish_time : 1617355413
//         * create_time : 1617355413
//         * update_time : 1617355413
//         * cancel_reason : 不想要
//         * b_type : 1
//         * b_type_desc : 抖音
//         * sub_b_type : 1
//         * sub_b_type_desc : 小程序
//         * send_pay : 1
//         * send_pay_desc : 鲁班广告
//         * author_id : 324234453
//         * author_name : XXXX
//         * theme_type : 1
//         * theme_type_desc : 直播间
//         * app_id : 43545454556
//         * room_id : 43545454556
//         * content_id : 43545454556
//         * video_id : 43545454556
//         * origin_id : 43545454556
//         * cid : 43545454556
//         * c_biz : 1
//         * c_biz_desc : 鲁班广告
//         * page_id : 43545454556
//         * pay_type : 1
//         * channel_payment_no : PAY234532534534
//         * order_amount : 600
//         * pay_amount : 500
//         * post_insurance_amount : 10
//         * modify_amount : -10
//         * modify_post_amount : -1
//         * promotion_amount : 1000
//         * promotion_shop_amount : 100
//         * promotion_platform_amount : 100
//         * shop_cost_amount : 100
//         * platform_cost_amount : 100
//         * promotion_talent_amount : 100
//         * promotion_pay_amount : 10
//         * code : djfafj
//         * post_tel : 12345678911
//         * post_receiver : 张三
//         * post_addr : {"province":{"name":"北京市","id":"110000"},"city":{"name":"市辖区","id":"110000"},"town":{"name":"海淀区","id":"110000"},"street":{"name":"中关村街道","id":"110000"},"detail":"丹棱街1号"}
//         * exp_ship_time : 1617355413
//         * ship_time : 1617355413
//         * logistics_receipt_time : 1617355413
//         * confirm_receipt_time : 1617355413
//         * goods_type : 1
//         * product_id : 3473196049974326300
//         * sku_id : 3254535
//         * spec : [{"name":"颜色","value":"蓝"}]
//         * first_cid : 20005
//         * second_cid : 20174
//         * third_cid : 20174
//         * fourth_cid : 20174
//         * out_sku_id : 43564553
//         * supplier_id : fsgfgsdg
//         * out_product_id : 432655662343
//         * warehouse_ids : ["49574835439","954764056"]
//         * out_warehouse_ids : ["49574835439","954764056"]
//         * inventory_type : 2
//         * inventory_type_desc : 普通库存
//         * reduce_stock_type : 1
//         * reduce_stock_type_desc : 下单减库存
//         * origin_amount : 100
//         * has_tax : true
//         * item_num : 2
//         * sum_amount : 200
//         * source_platform : XXX
//         * product_pic : https:xxxxx
//         * is_comment : 1
//         * product_name : 衣服
//         * inventory_list : [{"warehouse_id":"3141234234324","out_warehouse_id":"3254234234234","inventory_type":1,"inventory_type_desc":"普通库存","count":2}]
//         * post_amount : 1
//         * pre_sale_type : 1
//         * after_sale_info : {"after_sale_status":6,"after_sale_type":1,"refund_status":1}
//         */
//
//        private String orderId;
//        private String parentOrderId;
//        private Long orderLevel;
//        private Long biz;
//        private String bizDesc;
//        private Long orderType;
//        private String orderTypeDesc;
//        private Long tradeType;
//        private String tradeTypeDesc;
//        private Long orderStatus;
//        private String orderStatusDesc;
//        private Long mainStatus;
//        private String mainStatusDesc;
//        private Long payTime;
//        private Long orderExpireTime;
//        private Long finishTime;
//        private Long createTime;
//        private Long updateTime;
//        private String cancelReason;
//        private Long bType;
//        private String bTypeDesc;
//        private Long subBType;
//        private String subBTypeDesc;
//        private Long sendPay;
//        private String sendPayDesc;
//        private Long authorId;
//        private String authorName;
//        private String themeType;
//        private String themeTypeDesc;
//        private Long appId;
//        private Long roomId;
//        private String contentId;
//        private String videoId;
//        private String originId;
//        private Long cid;
//        private Long cBiz;
//        private String cBizDesc;
//        private Long pageId;
//        private Long payType;
//        private String channelPaymentNo;
//        private Long orderAmount;
//        private Long payAmount;
//        private Long postInsuranceAmount;
//        private Long modifyAmount;
//        private Long modifyPostAmount;
//        private Long promotionAmount;
//        private Long promotionShopAmount;
//        private Long promotionPlatformAmount;
//        private Long shopCostAmount;
//        private Long platformCostAmount;
//        private Long promotionTalentAmount;
//        private Long promotionPayAmount;
//        private String code;
//        private String postTel;
//        private String postReceiver;
//        private PostAddr postAddr;
//        private Long expShipTime;
//        private Long shipTime;
//        private Long logisticsReceiptTime;
//        private Long confirmReceiptTime;
//        private Long goodsType;
//        private Long productId;
//        private Long skuId;
//        private Long firstCid;
//        private Long secondCid;
//        private Long thirdCid;
//        private Long fourthCid;
//        private String outSkuId;
//        private String supplierId;
//        private String outProductId;
//        private String inventoryType;
//        private String inventoryTypeDesc;
//        private Long reduceStockType;
//        private String reduceStockTypeDesc;
//        private Long originAmount;
//        private Boolean hasTax;
//        private Long itemNum;
//        private Long sumAmount;
//        private String sourcePlatform;
//        private String productPic;
//        private Long isComment;
//        private String productName;
//        private Long postAmount;
//        private Long preSaleType;
//        private AfterSaleInfo afterSaleInfo;
//        private List<Spec> spec;
//        private List<String> warehouseIds;
//        private List<String> outWarehouseIds;
//        private List<InventoryList> inventoryList;
//
//
//        @NoArgsConstructor
//        @Data
//        public static class AfterSaleInfo {
//            /**
//             * after_sale_status : 6
//             * after_sale_type : 1
//             * refund_status : 1
//             */
//
//            private Long afterSaleStatus;
//            private Long afterSaleType;
//            private Long refundStatus;
//        }
//
//        @NoArgsConstructor
//        @Data
//        public static class Spec {
//            /**
//             * name : 颜色
//             * value : 蓝
//             */
//
//            private String name;
//            private String value;
//        }
//
//        @NoArgsConstructor
//        @Data
//        public static class InventoryList {
//            /**
//             * warehouse_id : 3141234234324
//             * out_warehouse_id : 3254234234234
//             * inventory_type : 1
//             * inventory_type_desc : 普通库存
//             * count : 2
//             */
//
//            private String warehouseId;
//            private String outWarehouseId;
//            private Long inventoryType;
//            private String inventoryTypeDesc;
//            private Long count;
//        }
//    }

    @NoArgsConstructor
    @Data
    public static class OrderPhaseList {
        /**
         * phase_order_id : 4781320682406083640
         * total_phase : 2
         * current_phase : 1
         * pay_success : true
         * sku_order_id : 4781320682406083640
         * campaign_id : 3214324342342
         * phase_payable_price : 100
         * phase_pay_type : 1
         * phase_open_time : 1617355413
         * phase_pay_time : 1617355413
         * phase_close_time : 1617355413
         * channel_payment_no : PAY34243247134325
         * phase_order_amount : 100
         * phase_sum_amount : 100
         * phase_post_amount : 100
         * phase_pay_amount : 100
         * phase_promotion_amount : 100
         * current_phase_status_desc : 已开始但未支付
         * sku_price : 100
         */

        private String phaseOrderId;
        private Long totalPhase;
        private Long currentPhase;
        private Boolean paySuccess;
        private String skuOrderId;
        private Long campaignId;
        private Long phasePayablePrice;
        private Long phasePayType;
        private Long phaseOpenTime;
        private Long phasePayTime;
        private Long phaseCloseTime;
        private String channelPaymentNo;
        private Long phaseOrderAmount;
        private Long phaseSumAmount;
        private Long phasePostAmount;
        private Long phasePayAmount;
        private Long phasePromotionAmount;
        private String currentPhaseStatusDesc;
        private Long skuPrice;
    }
}
