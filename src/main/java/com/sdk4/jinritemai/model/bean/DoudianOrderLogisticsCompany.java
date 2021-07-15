package com.sdk4.jinritemai.model.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoudianOrderLogisticsCompany {
    /**
     * 快递公司ID
     */
    private Long id;

    /**
     * 快递公司名称 例 “圆通快递”
     */
    private String name;
    /**
     * 物流公司code 例 “yuantong”
     */
    private String code;

}
