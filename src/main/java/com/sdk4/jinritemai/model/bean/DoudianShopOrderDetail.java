package com.sdk4.jinritemai.model.bean;

import com.sdk4.jinritemai.model.bean.orderdetail.LogisticsInfo;
import com.sdk4.jinritemai.model.bean.orderdetail.PostAddr;
import com.sdk4.jinritemai.model.bean.orderdetail.PromotionDetail;
import com.sdk4.jinritemai.model.bean.orderdetail.SkuOrderList;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * 新版订单接口 订单信息
 */
@NoArgsConstructor
@Data
@Getter
@Setter
public class DoudianShopOrderDetail {

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
     * promotion_detail : {"shop_discount_detail":{"total_amount":200,"coupon_amount":100,"full_discount_amount":100,"coupon_info":[{"coupon_id":4781320682406,"coupon_type":1,"coupon_meta_id":"43543523532","coupon_amount":100,"coupon_name":"优惠券"}],"full_discount_info":[{"campaign_id":4781320682406084000,"campaign_type":7,"share_discount_cost":{"platform_cost":100,"shop_cost":100},"campaign_name":"XXX活动","campaign_amount":200,"campaign_sub_type":1}]},"platform_discount_detail":{"total_amount":200,"coupon_amount":100,"full_discount_amount":100,"coupon_info":[{"coupon_id":4781320682406,"coupon_type":1,"coupon_meta_id":"43543523532","coupon_amount":100,"coupon_name":"优惠券"}],"full_discount_info":[{"campaign_id":4781320682406084000,"campaign_type":7,"share_discount_cost":{"platform_cost":100,"shop_cost":100},"campaign_name":"XXX活动","campaign_amount":200,"campaign_sub_type":1}]},"kol_discount_detail":{"total_amount":200,"coupon_amount":100,"full_discount_amount":100,"coupon_info":[{"coupon_id":4781320682406,"coupon_type":1,"coupon_meta_id":"43543523532","coupon_amount":100,"coupon_name":"优惠券"}],"full_discount_info":[{"campaign_id":4781320682406084000,"campaign_type":7,"share_discount_cost":{"platform_cost":100,"shop_cost":100},"campaign_name":"XXX活动","campaign_amount":200,"campaign_sub_type":1}]}}
     * sku_order_list : [{"order_id":"4781320682406083640","parent_order_id":"4781320682406083640","order_level":3,"biz":1,"biz_desc":"鲁班","order_type":0,"order_type_desc":"普通订单","trade_type":1,"trade_type_desc":"拼团","order_status":3,"order_status_desc":"待支付","main_status":103,"main_status_desc":"部分支付","pay_time":1617355413,"order_expire_time":1800,"finish_time":1617355413,"create_time":1617355413,"update_time":1617355413,"cancel_reason":"不想要","b_type":1,"b_type_desc":"抖音","sub_b_type":1,"sub_b_type_desc":"小程序","send_pay":"小程序","send_pay_desc":"小程序","author_id":"小程序","author_name":"小程序","theme_type":"小程序","theme_type_desc":"小程序","app_id":43545454556,"room_id":43545454556,"content_id":"43545454556","video_id":"43545454556","origin_id":"43545454556","cid":43545454556,"c_biz":43545454556,"c_biz_desc":"43545454556","page_id":43545454556,"pay_type":1,"channel_payment_no":"PAY234532534534","order_amount":600,"pay_amount":500,"post_insurance_amount":10,"modify_amount":-10,"modify_post_amount":-1,"promotion_amount":1000,"promotion_shop_amount":100,"promotion_platform_amount":100,"shop_cost_amount":100,"platform_cost_amount":100,"promotion_talent_amount":100,"promotion_pay_amount":10,"shop_receivable_amount":100,"code":"ahgldjj","post_tel":"12345678911","post_receiver":"张三","post_addr":{"province":{"name":"北京市","id":"110000"},"city":{"name":"市辖区","id":"110000"},"town":{"name":"海淀区","id":"110000"},"street":{"name":"中关村街道","id":"110000"},"detail":"丹棱街1号"},"exp_ship_time":1617355413,"ship_time":1617355413,"logistics_receipt_time":1617355413,"confirm_receipt_time":1617355413,"goods_type":1,"product_id":3473196049974326300,"sku_id":3254535,"spec":[{"name":"颜色","value":"蓝"}],"first_cid":20005,"second_cid":20174,"third_cid":20174,"fourth_cid":20174,"out_sku_id":"43564553","supplier_id":"fsgfgsdg","out_product_id":"432655662343","warehouse_ids":["49574835439","954764056"],"out_warehouse_ids":["49574835439","954764056"],"inventory_type":"2","inventory_type_desc":"普通库存","reduce_stock_type":1,"reduce_stock_type_desc":"下单减库存","origin_amount":100,"has_tax":true,"item_num":2,"sum_amount":200,"source_platform":"XXX","promotion_detail":{"shop_discount_detail":{"total_amount":200,"coupon_amount":100,"full_discount_amount":100,"coupon_info":[{"coupon_id":4781320682406,"coupon_type":1,"coupon_meta_id":"43543523532","coupon_amount":100,"coupon_name":"优惠券"}],"full_discount_info":[{"campaign_id":4781320682406084000,"campaign_type":7,"share_discount_cost":{"platform_cost":100,"shop_cost":100},"campaign_name":"XXX活动","campaign_amount":200,"campaign_sub_type":1}]},"platform_discount_detail":{"total_amount":200,"coupon_amount":100,"full_discount_amount":100,"coupon_info":[{"coupon_id":4781320682406,"coupon_type":1,"coupon_meta_id":"43543523532","coupon_amount":100,"coupon_name":"优惠券"}],"full_discount_info":[{"campaign_id":4781320682406084000,"campaign_type":7,"share_discount_cost":{"platform_cost":100,"shop_cost":100},"campaign_name":"XXX活动","campaign_amount":200,"campaign_sub_type":1}]},"kol_discount_detail":{"total_amount":200,"coupon_amount":100,"full_discount_amount":100,"coupon_info":[{"coupon_id":4781320682406,"coupon_type":1,"coupon_meta_id":"43543523532","coupon_amount":100,"coupon_name":"优惠券"}],"full_discount_info":[{"campaign_id":4781320682406084000,"campaign_type":7,"share_discount_cost":{"platform_cost":100,"shop_cost":100},"campaign_name":"XXX活动","campaign_amount":200,"campaign_sub_type":1}]}},"campaign_info":[{"campaign_id":4781320682406084000,"campaign_type":7,"share_discount_cost":{"platform_cost":100,"shop_cost":100},"campaign_name":"XXX活动","campaign_amount":200,"campaign_sub_type":1}],"sku_order_tag_ui":[{"key":"pre_sale_label","text":"全款预售","hover_text":"该商品需要送到质检中心，质检完成后发给用户","tag_type":"orange","help_doc":"https://school.jinritemai.com/doudian/web/article/101835?from=shop_article","sort":1}]}]
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
    private Long shopReceivableAmount;
    private String postTel;
    private String postReceiver;
    private PostAddr postAddr;
    private Long expShipTime;
    private Long shipTime;
    private PromotionDetail promotionDetail;
    private List<LogisticsInfo> logisticsInfo;
    private List<SkuOrderList> skuOrderList;

}