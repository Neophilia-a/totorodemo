package com.totoro.tororodemo.design_pattern.design_demo_8_01;

import com.totoro.tororodemo.design_pattern.design_demo_8_00.SsoInterceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/27
 */
public class LoginSsoDecorator extends SsoInterceptor {

    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取cookie
        String cookie = request.substring(1, 8);
        // 模拟获取校验
        boolean success = cookie.equals("success");
        if (!success) {
            return false;
        }
        String userId = request.substring(9);
        String method = authMap.get(userId);

        return "queryUserInfo".equals(method);
    }
}
