package com.totoro.tororodemo.design_pattern.design_demo_8_00;

/**
 * 功能：模拟单点登陆功能
 *
 * @author zhenghang
 * @date 2024/8/27
 */
public class SsoInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取cookie
        String cookie = request.substring(1, 8);
        return cookie.equals("success");
    }
}
