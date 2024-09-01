package com.totoro.tororodemo.design_pattern.design_demo_1_02.factory;

import java.util.concurrent.TimeUnit;

/**
 * 功能：接口适配器
 *
 * @author zhenghang
 * @date 2024/7/30
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
