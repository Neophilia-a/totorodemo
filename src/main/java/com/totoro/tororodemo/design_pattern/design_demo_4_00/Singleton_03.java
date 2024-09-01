package com.totoro.tororodemo.design_pattern.design_demo_4_00;

/**
 * 功能：饿汉模式(线程安全) 先加载
 *
 * @author zhenghang
 * @date 2024/8/9
 */
public class Singleton_03 {

    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {
    }

    public static Singleton_03 getInstance() {
        return instance;
    }
}
