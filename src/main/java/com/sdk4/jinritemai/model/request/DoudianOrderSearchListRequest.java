package com.sdk4.jinritemai.model.request;

import com.sdk4.jinritemai.DoudianRequest;
import com.sdk4.jinritemai.model.response.DoudianOrderSearchListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DoudianOrderSearchListRequest implements DoudianRequest<DoudianOrderSearchListResponse> {
    private final String method = "order.searchList";

    /**
     * 商品，number型代表商品ID，其它代表商品名称 3473196049974326153
     */
    private String product;
    /**
     * app渠道:0 站外 1 火山 2 抖音 3 头条 4 西瓜 5 微信 6 值点app 7 头条lite 8 懂车帝 9 皮皮虾 11 抖音极速版 12 TikTok 13 musically 14 穿山甲 15 火山极速版 16 服务市场
     */
    private Integer bType;
    /**
     * 售后状态：all-全部，in_aftersale-售后中，refund-退款中，refund_success-退款成功，refund_fail-退款失败，exchange_success-换货成功 aftersale_close-售后关闭
     */
    private String afterSaleStatusDesc;
    /**
     * 物流单号
     */
    private String trackingNo;
    /**
     * 预售类型：1 全款预售
     */
    private Integer presellType;
    /**
     * 订类型:0-普通订单 2-虚拟订单 4-平台券码 5-商家券码
     */
    private Integer orderType;
    /**
     * 下单时间：开始 1617355413
     */
    private Long createTimeStart;
    /**
     * 下单时间：截止 1617355413
     */
    private Long createTimeEnd;

    /**
     * 异常订单，1-异常取消，2-风控审核中
     */
    private Integer abnormalOrder;
    /**
     * 交易类型，1 拼团订单，2 定金预售
     */
    private Integer tradeType;
    /**
     * 异常订单，1-异常取消，2-风控审核中
     */
    private List<CombineStatus> combineStatus;
    /**
     * 更新时间：开始
     */
    private Long updateTimeStart;
    /**
     * 更新时间：截止
     */
    private Long updateTimeEnd;
    /**
     * 单页大小，限制100以内
     */
    private Integer size = 10;

    /**
     * 页码，0页开始
     */
    private Integer page = 0;
    /**
     * 排序 例：create_time
     */
    private String orderBy;

    /**
     * 排序类型，小到大或大到小，默认大到小
     */
    private Boolean orderAsc;


    @Override
    public Class<DoudianOrderSearchListResponse> getResponseClass() {
        return DoudianOrderSearchListResponse.class;
    }

    @Getter
    @Setter
    public static class CombineStatus {
        /**
         * 订单状态，","分隔多个状态
         */
        private String orderStatus;
        /**
         * 主流程状态，","分隔多个状态
         */
        private String mainStatus;
    }
}
