package com.totoro.tororodemo.design_pattern.design_demo_4_00;

/**
 * 功能：懒汉模式(线程安全) + synchronized
 *
 * @author zhenghang
 * @date 2024/8/9
 */
public class Singleton_02 {

    private static Singleton_02 instance;

    private Singleton_02() {
    }

    public static synchronized Singleton_02 getInstance() {
        if (null != instance) return instance;
        return new Singleton_02();
    }
}
