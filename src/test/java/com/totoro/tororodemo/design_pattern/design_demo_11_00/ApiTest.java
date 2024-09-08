package com.totoro.tororodemo.design_pattern.design_demo_11_00;

import com.totoro.tororodemo.TororoDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/9/4
 */
//@SpringBootTest
//@RunWith(SpringRunner.class)
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);


    @Test
    public void test_IUserDao() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDao userDao = beanFactory.getBean("userDao", IUserDao.class);
        String res = userDao.queryUserInfo("100001");
        logger.info("测试结果：{}", res);
    }
}
