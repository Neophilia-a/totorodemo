package com.totoro.tororodemo.design_pattern.design_demo_1_02.factory.impl;

import com.totoro.tororodemo.design_pattern.design_demo_1_00.matter.EGM;
import com.totoro.tororodemo.design_pattern.design_demo_1_02.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * 功能：emg集群适配器
 *
 * @author zhenghang
 * @date 2024/7/30
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
