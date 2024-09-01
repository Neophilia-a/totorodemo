package com.totoro.tororodemo.design_pattern.design_demo_9_02;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.totoro.tororodemo.design_pattern.design_demo_9_00.web.HelloWorldController;
import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Objects;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApiTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(WebApplicationContext webApplicationContext) {
        // 方法一：明确指定测试的controller类
        this.mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }

    @Test
    public void testWhiteListed() throws Exception {
        String userId = "1001";
        MvcResult mvcResult = this.mockMvc.perform(get("/api/queryUserInfo?userId={userId}", userId)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        mvcResult.getResponse().setCharacterEncoding("UTF-8");
        System.out.println(mvcResult.getResponse().getContentAsString());
        JSONObject jsonObject = JSON.parseObject(mvcResult.getResponse().getContentAsString());
        Assert.assertEquals("0000", jsonObject.get("code"));
    }

    @Test
    public void testNotWhiteListed() throws Exception {
        String userId = "小花花";
        MvcResult mvcResult = this.mockMvc.perform(get("/api/queryUserInfo?userId={userId}", userId)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        mvcResult.getResponse().setCharacterEncoding("UTF-8");
        System.out.println(mvcResult.getResponse().getContentAsString());
        JSONObject jsonObject = JSON.parseObject(mvcResult.getResponse().getContentAsString());
        Assert.assertEquals("1111", jsonObject.get("code"));
    }

}
