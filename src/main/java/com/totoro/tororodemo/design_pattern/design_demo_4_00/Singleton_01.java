package com.totoro.tororodemo.design_pattern.design_demo_4_00;

/**
 * 功能：懒汉模式（线程不安全）
 *
 * @author zhenghang
 * @date 2024/8/9
 */
public class Singleton_01 {

    private static Singleton_01 instance;

    private Singleton_01() {
    }

    public static Singleton_01 getInstance() {
        if (null != instance) return instance;
        return new Singleton_01();
    }
}
