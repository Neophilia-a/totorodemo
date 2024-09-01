package com.totoro.tororodemo.datastructure;

/**
 * 功能：自定义实现的hashmao结构 仅实现没有红黑树结构的hashmap
 *
 * @author zhenghang
 * @date 2024/6/1
 */
public class MyHashMap<K, V> {

    /**
     * 节点类
     *
     * @param <K> 值
     * @param <V> 键
     */
    class Node<K, V> {
        // 键值对
        private K key;

        private V value;

        // 链表 后继
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    // 默认容量
    final int DEFAULT_CAPACITY = 16;

    // 负载因子
    final float LOAD_FACTOR = 0.75f;

    // HashMap的大小
    private int size;

    // 桶数组
    Node<K, V>[] buckets;

    /**
     * 无参构造器 初始化对应数据
     */
    public MyHashMap() {
        buckets = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * 指定数组大小
     *
     * @param capacity 容量
     */
    public MyHashMap(int capacity) {
        buckets = new Node[capacity];
        size = 0;
    }

    /**
     * 哈希函数，指定地址
     *
     * @param key
     * @param length
     * @return
     */
    private int getIndex(K key, int length) {
        // 获取hashcode
        int hashCode = key.hashCode();
        // 桶数组长度取余
        int index = hashCode % length;
        return Math.abs(index);
    }

    public void put(K key, V value) {
        if (size >= buckets.length * LOAD_FACTOR) resize();
        putVal(key, value, buckets);
    }

    /**
     * 将元素存入指定的node数组中
     *
     * @param key
     * @param value
     * @param table
     */
    private void putVal(K key, V value, Node<K, V>[] table) {
        // 获取位置
        int index = getIndex(key, table.length);
        Node<K, V> node = table[index];
        // 插入的位置是空的
        if (node == null) {
            table[index] = new Node<>(key, value);
            size++;
            return;
        }
        // 插入的位置不为空 说明发生冲突，使用链地址法，遍历链表
        while (node != null) {
            // key相同覆盖
            if ((node.key.hashCode() == key.hashCode()) && (node.key == key || node.key.equals(key))) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        // 当前key不在链表中，插入头部
        Node<K, V> newNode = new Node<>(key, value, table[index]);
        table[index] = newNode;
        size++;
    }

    /**
     * 扩容
     */
    private void resize() {
        // 创建两倍大小容量的 数组
        Node<K, V>[] newBuckets = new Node[buckets.length * 2];
        // 将当前元素重新散列到新的桶数组中
        rehash(newBuckets);
        buckets = newBuckets;
    }

    /**
     * 重新散列当前元素
     *
     * @param newBuckets
     */
    private void rehash(Node<K, V>[] newBuckets) {
        // map大小重新计算
        size = 0;
        // 就老的数组刷新到新的数组中
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] == null) {
                continue;
            }
            Node<K, V> node = buckets[i];
            while (node != null) {
                // 元素放入新数组
                putVal(node.key, node.value, newBuckets);
                node = node.next;
            }
        }
    }

    /**
     * 根据key获取对应的值
     *
     * @param key
     * @return
     */
    public V get(K key) {
        int index = getIndex(key, buckets.length);
        if (buckets[index] == null) return null;
        Node<K, V> node = buckets[index];
        // 查找链表
        while (node != null) {
            if ((node.key.hashCode() == key.hashCode()) && (node.key == key || node.key.equals(key))) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    /**
     * 返回map的大小
     *
     * @return
     */
    public int size() {
        return size;
    }
}
