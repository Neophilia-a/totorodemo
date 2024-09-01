package com.totoro.tororodemo.design_pattern.design_demo_1_02.factory.impl;

import com.totoro.tororodemo.design_pattern.design_demo_1_00.matter.IIR;
import com.totoro.tororodemo.design_pattern.design_demo_1_02.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * 功能：iir集群适配器
 *
 * @author zhenghang
 * @date 2024/7/30
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
