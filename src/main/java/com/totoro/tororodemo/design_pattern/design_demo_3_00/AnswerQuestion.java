package com.totoro.tororodemo.design_pattern.design_demo_3_00;

/**
 * 功能：解答题
 *
 * @author zhenghang
 * @date 2024/8/7
 */
public class AnswerQuestion {
    private String name;  // 问题
    private String key;   // 答案

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
