package com.totoro.tororodemo.design_pattern.design_demo_8_01;

import org.junit.Test;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/27
 */
public class ApiTest {
    @Test
    public void test_LoginSsoDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator();
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }
}
