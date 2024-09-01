package com.totoro.tororodemo.design_pattern.design_demo_1_01;

import java.util.concurrent.TimeUnit;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/7/30
 */
public interface ICacheService {
    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);
}
