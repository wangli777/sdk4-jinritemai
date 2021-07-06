package com.sdk4.jinritemai.model.response;

import com.sdk4.jinritemai.DoudianOrderPage;
import com.sdk4.jinritemai.DoudianResponse;
import com.sdk4.jinritemai.model.bean.DoudianShopOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoudianOrderSearchListResponse extends DoudianResponse<DoudianOrderPage<DoudianShopOrder>> {
}
