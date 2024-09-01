package com.totoro.tororodemo.controller;

import com.totoro.tororodemo.skill.submit.RepeatSubmit;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：测试controller
 *
 * @author zhenghang
 * @date 2024/8/8
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RepeatSubmit(limitType = RepeatSubmit.Type.PARAM, lockTime = 10)
    @GetMapping("/saveCountInfo")
    public String saveCountInfo(@Param("no") String no) {
        return "OK" + no;
    }
}
