package com.totoro.tororodemo.design_pattern.design_demo_4_00;

/**
 * 功能：内部类懒加载(线程安全)
 *
 * @author zhenghang
 * @date 2024/8/9
 */
public class Singleton_04 {

    private static class SingletonHolder {
        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04() {

    }

    public static Singleton_04 getInstance() {
        return SingletonHolder.instance;
    }
}
