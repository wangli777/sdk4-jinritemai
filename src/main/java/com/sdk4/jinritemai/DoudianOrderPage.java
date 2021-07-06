package com.sdk4.jinritemai;

import com.sdk4.jinritemai.util.DoudianUtils;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static com.sdk4.jinritemai.util.DoudianUtils.isNotEmpty;

@Setter
public class DoudianOrderPage<T> {
    /**
     * 当前页数，从0开始
     */
    private Integer page;
    /**
     * 符合查询条件的总订单数
     */
    private Integer total;

    /**
     * 单页大小
     */
    private Integer size;

    /**
     * 订单信息列表
     */
    private List<T> shop_order_list;


    public int getTotal() {
        return DoudianUtils.returnAnyGreaterThanZero(total);
    }

    public int getPage() {
        return DoudianUtils.returnAnyGreaterThanZero(page);
    }

    public int getSize() {
        return DoudianUtils.returnAnyGreaterThanZero(size);
    }

    public List<T> getPageData() {
        return isNotEmpty(shop_order_list) ? shop_order_list : new ArrayList<>(0);
    }
}
