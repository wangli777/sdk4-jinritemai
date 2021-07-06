package com.sdk4.jinritemai;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class DoudianOrderWrapper<T> {

    /**
     * 订单信息详情
     */
    private T shop_order_detail;


}
