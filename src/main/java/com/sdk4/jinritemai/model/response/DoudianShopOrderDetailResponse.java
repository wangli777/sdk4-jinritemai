package com.sdk4.jinritemai.model.response;

import com.sdk4.jinritemai.DoudianOrderWrapper;
import com.sdk4.jinritemai.DoudianResponse;
import com.sdk4.jinritemai.model.bean.DoudianShopOrderDetail;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoudianShopOrderDetailResponse extends DoudianResponse<DoudianOrderWrapper<DoudianShopOrderDetail>> {
}
