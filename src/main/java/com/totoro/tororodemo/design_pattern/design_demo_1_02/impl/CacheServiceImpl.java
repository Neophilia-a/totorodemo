package com.totoro.tororodemo.design_pattern.design_demo_1_02.impl;

import com.totoro.tororodemo.design_pattern.design_demo_1_00.RedisUtils;
import com.totoro.tororodemo.design_pattern.design_demo_1_02.ICacheService;

import java.util.concurrent.TimeUnit;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/7/30
 */
public class CacheServiceImpl implements ICacheService {

    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
