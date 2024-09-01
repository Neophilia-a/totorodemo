package com.totoro.tororodemo.design_pattern.design_demo_9_00.web;

import com.totoro.tororodemo.design_pattern.design_demo_9_00.domain.UserInfo;
import com.totoro.tororodemo.design_pattern.design_demo_9_02.annotation.DoDoor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/29
 */
@RestController
public class HelloWorldController {

    @Value("${server.port}")
    private int port;


    /**
     * @DoDoor 自定义注解
     * key：需要从入参取值的属性字段，如果是对象则从对象中取值，如果是单个值则直接使用
     * returnJson：预设拦截时返回值，是返回对象的Json
     * <p>
     * http://localhost:8080/api/queryUserInfo?userId=1001
     * http://localhost:8080/api/queryUserInfo?userId=小团团
     */
    @DoDoor(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public UserInfo queryUserInfo(@RequestParam String userId) {
        return new UserInfo("虫虫:" + userId, 19, "天津市南开区旮旯胡同100号");
    }
}
