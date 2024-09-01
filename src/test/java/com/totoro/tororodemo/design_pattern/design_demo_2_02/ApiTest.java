package com.totoro.tororodemo.design_pattern.design_demo_2_02;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/4
 */
public class ApiTest {
    @Test
    public void test_Builder(){
        Builder builder = new Builder();

        // 豪华欧式
        System.out.println(builder.levelOne(new BigDecimal("132.52")).getDetail());

        // 轻奢田园
        System.out.println(builder.levelTwo(new BigDecimal("98.25")).getDetail());

        // 现代简约
        System.out.println(builder.levelThree(new BigDecimal("85.43")).getDetail());
    }
}
