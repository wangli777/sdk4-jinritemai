package com.sdk4.jinritemai.model.bean;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * 新版订单接口 订单信息
 */
@Getter
@Setter
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
     * shop_receivable_amount : 100
     * post_tel : 12345678911
     * post_receiver : 张三
     * post_addr : {"province":{"name":"北京市","id":"110000"},"city":{"name":"市辖区","id":"110000"},"town":{"name":"海淀区","id":"110000"},"street":{"name":"中关村街道","id":"110000"},"detail":"丹棱街1号"}
     * exp_ship_time : 1617355413
     * ship_time : 1617355413
     * logistics_info : [{"tracking_no":"3617355413","company":"shunfeng","ship_time":1617355413,"delivery_id":"shunfeng_3617355413","company_name":"顺丰","product_info":[{"product_name":"苹果","price":1000,"outer_sku_id":"sdfa","sku_id":3254535,"sku_specs":[{"name":"颜色","value":"蓝"}],"product_count":2,"product_id":3473196049974326300,"sku_order_id":"4781320682406083640"}]}]
     * sku_order_list : [{"order_id":"4781320682406083640","parent_order_id":"4781320682406083640","order_level":3,"biz":1,"biz_desc":"鲁班","order_type":0,"order_type_desc":"普通订单","trade_type":1,"trade_type_desc":"拼团","order_status":3,"order_status_desc":"待支付","main_status":103,"main_status_desc":"部分支付","pay_time":1617355413,"order_expire_time":1800,"finish_time":1617355413,"create_time":1617355413,"update_time":1617355413,"cancel_reason":"不想要","b_type":1,"b_type_desc":"抖音","sub_b_type":1,"sub_b_type_desc":"小程序","send_pay":"小程序","send_pay_desc":"小程序","author_id":"小程序","author_name":"小程序","theme_type":"小程序","theme_type_desc":"小程序","app_id":43545454556,"room_id":43545454556,"content_id":"43545454556","video_id":"43545454556","origin_id":"43545454556","cid":43545454556,"c_biz":43545454556,"c_biz_desc":"43545454556","page_id":43545454556,"pay_type":1,"channel_payment_no":"PAY234532534534","order_amount":600,"pay_amount":500,"post_insurance_amount":10,"modify_amount":-10,"modify_post_amount":-1,"promotion_amount":1000,"promotion_shop_amount":100,"promotion_platform_amount":100,"shop_cost_amount":100,"platform_cost_amount":100,"promotion_talent_amount":100,"promotion_pay_amount":10,"shop_receivable_amount":100,"code":"djfafj","post_tel":"12345678911","post_receiver":"张三","post_addr":{"province":{"name":"北京市","id":"110000"},"city":{"name":"市辖区","id":"110000"},"town":{"name":"海淀区","id":"110000"},"street":{"name":"中关村街道","id":"110000"},"detail":"丹棱街1号"},"exp_ship_time":1617355413,"ship_time":1617355413,"logistics_receipt_time":1617355413,"confirm_receipt_time":1617355413,"goods_type":1,"product_id":3473196049974326300,"sku_id":3254535,"spec":[{"name":"颜色","value":"蓝"}],"first_cid":20005,"second_cid":20174,"third_cid":20174,"fourth_cid":20174,"out_sku_id":"43564553","supplier_id":"fsgfgsdg","out_product_id":"432655662343","warehouse_ids":["49574835439","954764056"],"out_warehouse_ids":["49574835439","954764056"],"inventory_type":"2","inventory_type_desc":"普通库存","reduce_stock_type":1,"reduce_stock_type_desc":"下单减库存","origin_amount":100,"has_tax":true,"item_num":2,"sum_amount":200,"source_platform":"XXX"}]
     */

    private Integer shopId;
    private String shopName;
    private String openId;
    private String orderId;
    private Integer orderLevel;
    private Integer biz;
    private String bizDesc;
    private Integer orderType;
    private String orderTypeDesc;
    private Integer tradeType;
    private String tradeTypeDesc;
    private Integer orderStatus;
    private String orderStatusDesc;
    private Integer mainStatus;
    private String mainStatusDesc;
    private Long payTime;
    private Long orderExpireTime;
    private Long finishTime;
    private Long createTime;
    private Long updateTime;
    private String cancelReason;
    private String buyerWords;
    private String sellerWords;
    private Integer bType;
    private String bTypeDesc;
    private Integer subBType;
    private String subBTypeDesc;
    /**
     * 小程序id
     */
    private Long appId;
    private Integer payType;
    private String channelPaymentNo;
    /**
     * 订单金额（分）
     */
    private Long orderAmount;
    /**
     * 支付金额（分）
     */
    private Long payAmount;
    /**
     * 快递费（分）
     */
    private Long postAmount;
    /**
     * 运费险金额
     */
    private Long postInsuranceAmount;
    /**
     * 改价金额变化量
     */
    private Long modifyAmount;
    /**
     * 改价运费金额变化量
     */
    private Long modifyPostAmount;
    /**
     * 单优惠总金额= 店铺优惠金额+ 平台优惠金额+ 达人优惠金额+ 支付优惠金额
     */
    private Long promotionAmount;
    /**
     * 店铺优惠金额
     */
    private Long promotionShopAmount;
    /**
     * 平台优惠金额
     */
    private Long promotionPlatformAmount;
    /**
     * 平台优惠金额卖家承担部分
     */
    private Long shopCostAmount;
    /**
     * 平台优惠金额平台承担部分
     */
    private Long platformCostAmount;
    /**
     * 达人优惠金额
     */
    private Long promotionTalentAmount;
    /**
     * 支付优惠金额
     */
    private Long promotionPayAmount;
    /**
     * 卖家应收金额
     */
    private Long shopReceivableAmount;
    /**
     * 收件人电话
     */
    private String postTel;
    /**
     * 收件人姓名
     */
    private String postReceiver;
    /**
     * 收件人地址
     */
    private PostAddr postAddr;
    /**
     * 预计发货时间
     */
    private Long expShipTime;
    /**
     * 发货时间
     */
    private Long shipTime;
    /**
     * 物流信息
     */
    private List<LogisticsInfo> logisticsInfo;
    /**
     * 商品单信息
     */
    private List<SkuOrderList> skuOrderList;

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

        /**
         * 物流单号
         */
        private String trackingNo;
        /**
         * 物流公司
         */
        private String company;
        /**
         * 发货时间
         */
        private Long shipTime;
        /**
         * 包裹id
         */
        private String deliveryId;
        /**
         * 物流公司名称
         */
        private String companyName;
        /**
         *
         */
        private List<ProductInfo> productInfo;

        @NoArgsConstructor
        @Data
        public static class ProductInfo {
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

            /**
             * 商品名称
             */
            private String productName;
            /**
             * 商品价格
             */
            private Integer price;
            /**
             * 商家编码
             */
            private String outerSkuId;
            /**
             * 商品skuId
             */
            private Long skuId;
            /**
             * 商品数量
             */
            private Integer productCount;
            /**
             * 商品ID
             */
            private Long productId;
            /**
             * 商品单ID
             */
            private String skuOrderId;
            /**
             * 规格信息
             */
            private List<SkuSpecs> skuSpecs;

            @NoArgsConstructor
            @Data
            public static class SkuSpecs {
                /**
                 * name : 颜色
                 * value : 蓝
                 */

                private String name;
                private String value;
            }
        }
    }

    @NoArgsConstructor
    @Data
    public static class SkuOrderList {
        /**
         * order_id : 4781320682406083640
         * parent_order_id : 4781320682406083640
         * order_level : 3
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
         * b_type : 1
         * b_type_desc : 抖音
         * sub_b_type : 1
         * sub_b_type_desc : 小程序
         * send_pay : 小程序
         * send_pay_desc : 小程序
         * author_id : 小程序
         * author_name : 小程序
         * theme_type : 小程序
         * theme_type_desc : 小程序
         * app_id : 43545454556
         * room_id : 43545454556
         * content_id : 43545454556
         * video_id : 43545454556
         * origin_id : 43545454556
         * cid : 43545454556
         * c_biz : 43545454556
         * c_biz_desc : 43545454556
         * page_id : 43545454556
         * pay_type : 1
         * channel_payment_no : PAY234532534534
         * order_amount : 600
         * pay_amount : 500
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
         * shop_receivable_amount : 100
         * code : djfafj
         * post_tel : 12345678911
         * post_receiver : 张三
         * post_addr : {"province":{"name":"北京市","id":"110000"},"city":{"name":"市辖区","id":"110000"},"town":{"name":"海淀区","id":"110000"},"street":{"name":"中关村街道","id":"110000"},"detail":"丹棱街1号"}
         * exp_ship_time : 1617355413
         * ship_time : 1617355413
         * logistics_receipt_time : 1617355413
         * confirm_receipt_time : 1617355413
         * goods_type : 1
         * product_id : 3473196049974326300
         * sku_id : 3254535
         * spec : [{"name":"颜色","value":"蓝"}]
         * first_cid : 20005
         * second_cid : 20174
         * third_cid : 20174
         * fourth_cid : 20174
         * out_sku_id : 43564553
         * supplier_id : fsgfgsdg
         * out_product_id : 432655662343
         * warehouse_ids : ["49574835439","954764056"]
         * out_warehouse_ids : ["49574835439","954764056"]
         * inventory_type : 2
         * inventory_type_desc : 普通库存
         * reduce_stock_type : 1
         * reduce_stock_type_desc : 下单减库存
         * origin_amount : 100
         * has_tax : true
         * item_num : 2
         * sum_amount : 200
         * source_platform : XXX
         */

        /**
         * 商品订单号
         */
        private String orderId;
        /**
         * 父订单号（店铺订单号）
         */
        private String parentOrderId;
        /**
         * 订单层级
         */
        private Integer orderLevel;
        /**
         * 业务来源：1-鲁班 2-小店 3-好好学习等
         */
        private Integer biz;
        private String bizDesc;
        private Integer orderType;
        private String orderTypeDesc;
        private Integer tradeType;
        private String tradeTypeDesc;
        /**
         * 订单状态
         */
        private Integer orderStatus;
        private String orderStatusDesc;
        /**
         * 主流程状态
         */
        private Integer mainStatus;
        private String mainStatusDesc;
        /**
         * 支付时间
         */
        private Long payTime;
        /**
         * 订单过期时间
         */
        private Long orderExpireTime;
        /**
         * 订单完成时间
         */
        private Long finishTime;
        /**
         * 下单时间
         */
        private Long createTime;
        /**
         * 订单更新时间
         */
        private Long updateTime;
        private String cancelReason;
        private Integer bType;
        private String bTypeDesc;
        private Integer subBType;
        private String subBTypeDesc;
        private String sendPay;
        private String sendPayDesc;
        private String authorId;
        private String authorName;
        private String themeType;
        private String themeTypeDesc;
        private Long appId;
        private Long roomId;
        private String contentId;
        private String videoId;
        private String originId;
        private Long cid;
        private Long cBiz;
        private String cBizDesc;
        private Long pageId;
        private Integer payType;
        private String channelPaymentNo;
        /**
         * 订单金额（分）
         */
        private Long orderAmount;
        /**
         * 支付金额（分）
         */
        private Long payAmount;
        /**
         * 运费险金额
         */
        private Long postInsuranceAmount;
        /**
         * 改价金额变化量
         */
        private Long modifyAmount;
        private Long modifyPostAmount;
        private Long promotionAmount;
        private Long promotionShopAmount;
        private Long promotionPlatformAmount;
        private Long shopCostAmount;
        private Long platformCostAmount;
        private Long promotionTalentAmount;
        private Long promotionPayAmount;
        private Long shopReceivableAmount;
        /**
         * 商家编码
         */
        private String code;
        /**
         * 收件人电话
         */
        private String postTel;
        /**
         * 收件人姓名
         */
        private String postReceiver;
        /**
         * 收件人地址
         */
        private PostAddr postAddr;
        /**
         * 预计发货时间
         */
        private Long expShipTime;
        /**
         * 发货时间
         */
        private Long shipTime;
        /**
         * 物流收货时间
         */
        private Long logisticsReceiptTime;
        /**
         * 用户确认收货时间
         */
        private Long confirmReceiptTime;
        /**
         * 商品类型
         */
        private Integer goodsType;
        /**
         * 商品ID
         */
        private Long productId;
        /**
         * 商品名称
         */
        private String productName;
        /**
         * 商品主图
         */
        private String productPic;
        /**
         * 商品ID
         */
        private Long skuId;
        /**
         * 一级类目
         */
        private Integer firstCid;
        private Integer secondCid;
        private Integer thirdCid;
        private Integer fourthCid;
        private String outSkuId;
        private String supplierId;
        private String outProductId;
        private String inventoryType;
        private String inventoryTypeDesc;
        private Integer reduceStockType;
        private String reduceStockTypeDesc;
        /**
         * 商品现价
         */
        private Long originAmount;
        private boolean hasTax;
        /**
         * 商品件数
         */
        private Integer itemNum;
        /**
         * 商品现价*件数
         */
        private Integer sumAmount;
        private String sourcePlatform;
        /**
         * 规格信息
         */
        private List<Spec> spec;
        private List<String> warehouseIds;
        private List<String> outWarehouseIds;

//                @NoArgsConstructor
//                @Data
//                public static class PostAddrX {
//                    /**
//                     * province : {"name":"北京市","id":"110000"}
//                     * city : {"name":"市辖区","id":"110000"}
//                     * town : {"name":"海淀区","id":"110000"}
//                     * street : {"name":"中关村街道","id":"110000"}
//                     * detail : 丹棱街1号
//                     */
//
//                    private ProvinceX province;
//                    private CityX city;
//                    private TownX town;
//                    private StreetX street;
//                    private String detail;
//
//                    @NoArgsConstructor
//                    @Data
//                    public static class ProvinceX {
//                        /**
//                         * name : 北京市
//                         * id : 110000
//                         */
//
//                        private String name;
//                        private String id;
//                    }
//
//                    @NoArgsConstructor
//                    @Data
//                    public static class CityX {
//                        /**
//                         * name : 市辖区
//                         * id : 110000
//                         */
//
//                        private String name;
//                        private String id;
//                    }
//
//                    @NoArgsConstructor
//                    @Data
//                    public static class TownX {
//                        /**
//                         * name : 海淀区
//                         * id : 110000
//                         */
//
//                        private String name;
//                        private String id;
//                    }
//
//                    @NoArgsConstructor
//                    @Data
//                    public static class StreetX {
//                        /**
//                         * name : 中关村街道
//                         * id : 110000
//                         */
//
//                        private String name;
//                        private String id;
//                    }
//                }

        @NoArgsConstructor
        @Data
        public static class Spec {
            /**
             * name : 颜色
             * value : 蓝
             */

            private String name;
            private String value;
        }
    }
}
