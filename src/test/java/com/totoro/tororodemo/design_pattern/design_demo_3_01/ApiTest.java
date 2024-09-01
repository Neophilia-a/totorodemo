package com.totoro.tororodemo.design_pattern.design_demo_3_01;

import org.junit.Test;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/7
 */
public class ApiTest {
    @Test
    public void test_QuestionBankController() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }
}
