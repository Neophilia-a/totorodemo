package com.totoro.tororodemo.design_pattern.design_demo_1_01;

import com.totoro.tororodemo.design_pattern.design_demo_1_01.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/7/30
 */
public class ApiTest {

    @Test
    public void test_CacheService() {

        ICacheService cacheService = new CacheServiceImpl();

        cacheService.set("user_name_01", "渣渣", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);

    }
}
