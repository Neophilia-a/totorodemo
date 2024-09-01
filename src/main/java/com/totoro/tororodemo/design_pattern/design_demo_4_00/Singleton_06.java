package com.totoro.tororodemo.design_pattern.design_demo_4_00;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 功能： CAS(线程安全) AtomicReference
 *
 * @author zhenghang
 * @date 2024/8/9
 */
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<Singleton_06>();

    private static Singleton_06 instance;

    private Singleton_06() {
    }

    public static final Singleton_06 getInstance() {
        for (; ; ) {
            Singleton_06 instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        // com.totoro.tororodemo.design_pattern.design_demo_4_00.Singleton_06@179d3b25
        System.out.println(Singleton_06.getInstance());
        //com.totoro.tororodemo.design_pattern.design_demo_4_00.Singleton_06@179d3b25
        System.out.println(Singleton_06.getInstance());
    }

}
