package com.totoro.tororodemo.design_pattern.design_demo_8_00;

/**
 * 功能：模拟spring的HandlerInterceptor
 *
 * @author zhenghang
 * @date 2024/8/27
 */
public interface HandlerInterceptor {
    boolean preHandle(String request, String response, Object handler);
}
