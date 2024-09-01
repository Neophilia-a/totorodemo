package com.totoro.tororodemo.design_pattern.design_demo_4_00;

/**
 * 功能：双检锁(线程安全) 空时 synchronized 再判空
 *
 * @author zhenghang
 * @date 2024/8/9
 */
public class Singleton_05 {

    private static volatile Singleton_05 instance;

    private Singleton_05() {
    }

    public static Singleton_05 getInstance() {
        if (null == instance) return instance;
        synchronized (Singleton_05.class) {
            if (null == instance) {
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
