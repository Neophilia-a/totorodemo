package com.totoro.tororodemo.design_pattern.design_demo_5_01;

import com.alibaba.fastjson.JSON;
import com.totoro.tororodemo.design_pattern.design_demo_5_00.mq.AccountMq;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/11
 */
public class AccountMqService {
    public void onMessage(String message) {

        AccountMq mq = JSON.parseObject(message, AccountMq.class);

        mq.getNumber();
        mq.getAccountDate();

        // ... 处理自己的业务
    }
}
