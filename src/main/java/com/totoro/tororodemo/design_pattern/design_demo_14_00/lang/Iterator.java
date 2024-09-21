package com.totoro.tororodemo.design_pattern.design_demo_14_00.lang;

/**
 * 功能：迭代器定义
 *
 * @author zhenghang
 * @date 2024/9/21
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();
}
