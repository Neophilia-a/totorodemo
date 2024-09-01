package com.totoro.tororodemo.design_pattern.design_demo_5_01;

import com.alibaba.fastjson.JSON;
import com.totoro.tororodemo.design_pattern.design_demo_5_00.mq.OrderMq;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/11
 */
public class OrderMqService {
    public void onMessage(String message) {

        OrderMq mq = JSON.parseObject(message, OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        // ... 处理自己的业务
    }
}
