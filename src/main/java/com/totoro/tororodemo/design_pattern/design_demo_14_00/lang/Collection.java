package com.totoro.tororodemo.design_pattern.design_demo_14_00.lang;

/**
 * 功能：集合功能接口定义
 *
 * @author zhenghang
 * @date 2024/9/21
 */
public interface Collection<E, L> extends Iterable<E> {
    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    Iterator<E> iterator();
}
