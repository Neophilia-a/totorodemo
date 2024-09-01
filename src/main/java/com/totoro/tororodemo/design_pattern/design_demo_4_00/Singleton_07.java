package com.totoro.tororodemo.design_pattern.design_demo_4_00;

/**
 * 功能：枚举单例(线程安全) Effective Java 作者推荐
 *
 * @author zhenghang
 * @date 2024/8/9
 */
public enum Singleton_07 {
    INSTANCE;
    public void test() {
        System.out.println("hi~");
    }
}
