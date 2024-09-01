package com.totoro.tororodemo.skill.submit;

import com.totoro.tororodemo.controller.TestController;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.SharedHttpSessionConfigurer.*;

import java.util.Objects;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/8
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
        this.mockMvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
        // 方法二：基于Spring容器进行配置
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testRepeatSubmit() throws Exception {
        String no = "4";
        MvcResult mvcResult = this.mockMvc.perform(get("/test/saveCountInfo?no={no}", no)
                .accept(MediaType.APPLICATION_JSON)).andReturn();
        Assertions.assertTrue(Objects.equals(mvcResult.getResponse().getContentAsString(), "OK" + no));
        MvcResult mvcResult2 = this.mockMvc.perform(get("/test/saveCountInfo?no={no}", no)
                .accept(MediaType.APPLICATION_JSON)).andReturn();
        Assertions.assertFalse(Objects.equals(mvcResult2.getResponse().getContentAsString(), "重复提交, 请稍后再次提交"));
    }
}
