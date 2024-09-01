package com.totoro.tororodemo.design_pattern.design_demo_1_02;

import java.util.concurrent.TimeUnit;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/7/30
 */
public interface ICacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
