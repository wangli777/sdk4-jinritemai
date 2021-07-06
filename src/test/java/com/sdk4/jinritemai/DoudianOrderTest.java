package com.sdk4.jinritemai;

import com.alibaba.fastjson.JSON;
import com.sdk4.jinritemai.exception.ApiException;
import com.sdk4.jinritemai.model.bean.DoudianAccessToken;
import com.sdk4.jinritemai.model.bean.DoudianOrder;
import com.sdk4.jinritemai.model.bean.DoudianShopOrder;
import com.sdk4.jinritemai.model.request.*;
import com.sdk4.jinritemai.model.response.*;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DoudianOrderTest extends DoudianClientTest {

    @Test
    public void testOrderList() throws ApiException {
        DoudianOrderListRequest request = new DoudianOrderListRequest();
        request.setStartTime("2021-04-18 00:00:00");
        request.setEndTime("2021-04-19 00:00:00");

        DoudianClient client = getClient();
        // 根据店铺id获取店铺授权信息
        DoudianAccessToken accessToken = new DoudianAccessToken();
        accessToken.setAccessToken("fdda79c1-c7b7-4eee-b354-61c90b4efaa6");
        accessToken.setExpiresIn(604800);
        accessToken.setExpire(System.currentTimeMillis() + (accessToken.getExpiresIn() * 1000) - 60000);
        accessToken.setRefreshToken("e90d592f-87bc-47eb-8530-8f6435fad04f");

        client.setAccessToken(accessToken);
        DoudianOrderListResponse response = client.execute(request);

//        client.execute(request, accessToken);
        if (!response.isSuccess()) {
            System.err.println("获取订单列表失败:" + response.getMessage());
        } else {
            DoudianPage<DoudianOrder> page = response.getData();
            for (DoudianOrder order : page.getPageData()) {
                System.out.println(JSON.toJSONString(order));
            }
        }
    }

    @Test
    public void testShopOrderDetail() throws ApiException, ParseException {
        DoudianShopOrderDetailRequest request = new DoudianShopOrderDetailRequest();
        request.setShopOrderId("4814468277927640124");

        DoudianClient client = getClient();
        // 根据店铺id获取店铺授权信息
        DoudianAccessToken accessToken = new DoudianAccessToken();
        accessToken.setAccessToken("b4b264ee-8dcb-4e95-9962-2a96fc94850a");
        accessToken.setExpiresIn(604800);
        accessToken.setExpire(System.currentTimeMillis() + (accessToken.getExpiresIn() * 1000) - 60000);
        accessToken.setRefreshToken("5dda420a-ba65-4134-897f-11ed20367dda");

        client.setAccessToken(accessToken);
        DoudianShopOrderDetailResponse response = client.execute(request);
        System.out.println(JSON.toJSONString(response));
//        System.out.println("===");

//        if (!response.isSuccess()) {
//            System.err.println("获取订单详情失败:" + response.getMessage());
//        } else {
//            DoudianOrderWrapper<DoudianShopOrderDetail> data = response.getData();
//            System.out.println(JSON.toJSONString(data));
//
////            for (DoudianShopOrder order : page.getPageData()) {
////                System.out.println(JSON.toJSONString(order));
////            }
//        }
    }

    @Test
    public void testOrderSearchList() throws ApiException, ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DoudianOrderSearchListRequest request = new DoudianOrderSearchListRequest();
        request.setCreateTimeStart(dateFormat.parse("2021-04-18 00:00:00").getTime() / 1000);
        request.setCreateTimeEnd(dateFormat.parse("2021-04-19 00:00:00").getTime() / 1000);
        request.setSize(2);
        request.setPage(1);

        DoudianClient client = getClient();
        // 根据店铺id获取店铺授权信息
        DoudianAccessToken accessToken = new DoudianAccessToken();
        accessToken.setAccessToken("fdda79c1-c7b7-4eee-b354-61c90b4efaa6");
        accessToken.setExpiresIn(604800);
        accessToken.setExpire(System.currentTimeMillis() + (accessToken.getExpiresIn() * 1000) - 60000);
        accessToken.setRefreshToken("e90d592f-87bc-47eb-8530-8f6435fad04f");

        client.setAccessToken(accessToken);
        DoudianOrderSearchListResponse response = client.execute(request);
        System.out.println(JSON.toJSONString(response));

        if (!response.isSuccess()) {
            System.err.println("获取订单列表失败:" + response.getMessage());
        } else {
            DoudianOrderPage<DoudianShopOrder> page = response.getData();
            int total = page.getTotal();
            int page1 = page.getPage();
            int size = page.getSize();
            System.out.println(total + " " + page1 + " " + size);

//            for (DoudianShopOrder order : page.getPageData()) {
//                System.out.println(JSON.toJSONString(order));
//            }
        }
    }

    @Test
    public void testOrderDetail() throws ApiException {
        DoudianOrderDetailRequest request = new DoudianOrderDetailRequest();
        request.setOrderId("4736605172296554197A");
        DoudianOrderDetailResponse response = getClient().execute(request);
        if (!response.isSuccess()) {
            System.err.println("获取订单详情失败:" + response.getMessage());
        } else {
            DoudianPage<DoudianOrder> page = response.getData();
            for (DoudianOrder order : page.getPageData()) {
                System.out.println(JSON.toJSONString(order));
            }
        }
    }

    @Test
    public void testOrderStockUp() throws ApiException {
        DoudianOrderStockUpRequest request = new DoudianOrderStockUpRequest();
        request.setOrderId("4736605172296554197A");
        DoudianOrderStockUpResponse response = getClient().execute(request);
        if (!response.isSuccess()) {
            System.err.println("确认货到付款订单失败:" + response.getMessage());
        } else {
            System.out.println("确认货到付款订单成功");
        }
    }

    @Test
    public void testOrderCancel() throws ApiException {
        DoudianOrderCancelRequest request = new DoudianOrderCancelRequest();
        request.setOrderId("4736605172296554197A");
        DoudianOrderCancelResponse response = getClient().execute(request);
        if (!response.isSuccess()) {
            System.err.println("取消货到付款订单失败:" + response.getMessage());
        } else {
            System.out.println("取消货到付款订单成功");
        }
    }

    @Test
    public void testOrderServiceList() throws ApiException {
        DoudianOrderServiceListRequest request = new DoudianOrderServiceListRequest();
        DoudianOrderServiceListResponse response = getClient().execute(request);
        if (!response.isSuccess()) {
            System.err.println("获取服务请求列表失败:" + response.getMessage());
        } else {
            System.out.println("获取服务请求列表成功");
        }
    }

    @Test
    public void testOrderReplyService() throws ApiException {
        DoudianOrderReplyServiceRequest request = new DoudianOrderReplyServiceRequest();
        request.setId("1");
        request.setReply("回复信息");
        DoudianOrderReplyServiceResponse response = getClient().execute(request);
        if (!response.isSuccess()) {
            System.err.println("回复失败:" + response.getMessage());
        } else {
            System.out.println("回复成功");
        }
    }

    @Test
    public void testOrderAddOrderRemark() throws ApiException {
        DoudianOrderAddOrderRemarkRequest request = new DoudianOrderAddOrderRemarkRequest();
        request.setOrderId("4736605172296554197A");
        request.setRemark("sh订单");
        request.setIsAddStar(true);
        request.setStar(1);
        DoudianOrderAddOrderRemarkResponse response = getClient().execute(request);
        if (!response.isSuccess()) {
            System.err.println("添加订单备注失败:" + response.getMessage());
        } else {
            System.out.println("添加订单备注成功");
        }
    }

}
