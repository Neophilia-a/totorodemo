package com.totoro.tororodemo.design_pattern.design_demo_1_02;

import com.totoro.tororodemo.design_pattern.design_demo_1_02.factory.JDKProxy;
import com.totoro.tororodemo.design_pattern.design_demo_1_02.factory.impl.EGMCacheAdapter;
import com.totoro.tororodemo.design_pattern.design_demo_1_02.factory.impl.IIRCacheAdapter;
import com.totoro.tororodemo.design_pattern.design_demo_1_02.impl.CacheServiceImpl;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_CacheService() throws Exception {

        ICacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "zhazha1");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        ICacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "zhazha2");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);

    }

}
