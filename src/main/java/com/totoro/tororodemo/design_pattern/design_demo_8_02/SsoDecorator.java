package com.totoro.tororodemo.design_pattern.design_demo_8_02;

import com.totoro.tororodemo.design_pattern.design_demo_8_00.HandlerInterceptor;

/**
 * 功能：抽象类装饰角色
 *
 * @author zhenghang
 * @date 2024/8/27
 */
public class SsoDecorator implements HandlerInterceptor {

    private HandlerInterceptor handlerInterceptor;

    private SsoDecorator() {

    }

    public SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
