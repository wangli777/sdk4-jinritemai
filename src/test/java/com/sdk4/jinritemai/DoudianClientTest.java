package com.sdk4.jinritemai;

import com.alibaba.fastjson.JSON;
import com.sdk4.jinritemai.model.bean.DoudianAccessToken;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DoudianClientTest {
    DoudianClient client;
    String appSecret;

    {
        Properties properties = new Properties();
        InputStream in = DoudianClientTest.class.getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        appSecret = properties.getProperty("appSecret");
        client = new DefaultDoudianClient(
                properties.getProperty("serverUrl"),
                properties.getProperty("appKey"),
                properties.getProperty("appSecret")
        );
    }

    public Properties loadMessage(String name) {
        Properties properties = new Properties();
        InputStream in = DoudianClientTest.class
                .getClassLoader()
                .getResourceAsStream(String.format("message/%s.properties", name));
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    // 自用型应用
    public DoudianClient getClient() {
        return client;
    }

    // 工具型应用
    public DoudianClient getClient(String code) {
        DoudianAccessToken accessToken = client.codeToToken(code);

        if (!accessToken.isSuccess()) {
            // code 换取 access token 失败
        } else {
            // 存储该授权店铺的信息
            // accessToken 授权token
            // expiresIn 有效期(秒)
            // shopId 店铺id
            // shopName 店铺名
            // refreshToken 刷新token
            // 计算 access token 过期时间（向前推1分钟）
            int expiresIn = accessToken.getExpiresIn();
            long expire = System.currentTimeMillis() + (expiresIn - 60) * 1000;
            // 存储
        }
        client.setAccessToken(accessToken);

        return client;
    }

    public DoudianClient getClientFromShop(Long shopId) {
        // 根据店铺id获取店铺授权信息
        DoudianAccessToken accessToken = new DoudianAccessToken();
        accessToken.setAccessToken("fdda79c1-c7b7-4eee-b354-61c90b4efaa6");
        accessToken.setExpiresIn(604800);
        accessToken.setExpire(System.currentTimeMillis() + (accessToken.getExpiresIn() * 1000) - 60000);
        accessToken.setRefreshToken("e90d592f-87bc-47eb-8530-8f6435fad04f");

        client.setAccessToken(accessToken);
        if (!accessToken.isValid()) {
            accessToken = client.getAccessToken(accessToken.getRefreshToken());
            if (accessToken.isValid()) {
                // 存储该店铺新的授权信息
                // accessToken 授权token
                // expiresIn 有效期(秒)
                // shopId 店铺id
                // shopName 店铺名
                // refreshToken 刷新token
                // 计算 access token 过期时间（向前推1分钟）
                int expiresIn = accessToken.getExpiresIn();
                long expire = System.currentTimeMillis() + (expiresIn - 60) * 1000;
            }
        }
        if (!accessToken.isValid()) {
            // 授权获取失败
            throw new RuntimeException("授权获取失败");
        }
        client.setAccessToken(accessToken);

        return client;
    }

    @Test
    public void testGetAccessTokenByCode() {
        DoudianClient client = getClient("3dd0cd4e-fe6a-4c78-bcd1-926c36a959e3");
        System.out.println(client);
    }

    @Test
    public void testGetAccessTokenByRefresh() {
        DoudianAccessToken accessToken = client.getAccessToken("5dda420a-ba65-4134-897f-11ed20367dda");
        System.out.println(accessToken.toString());
    }

    @Test
    public void testGetAccessToken() {
        DoudianAccessToken accessToken = client.getAccessToken();
        System.out.println(JSON.toJSONString(accessToken, true));
    }
}