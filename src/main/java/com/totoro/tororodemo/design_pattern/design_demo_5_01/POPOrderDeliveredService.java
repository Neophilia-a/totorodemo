package com.totoro.tororodemo.design_pattern.design_demo_5_01;

import com.alibaba.fastjson.JSON;
import com.totoro.tororodemo.design_pattern.design_demo_5_00.mq.POPOrderDeliveredMq;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/11
 */
public class POPOrderDeliveredService {
    public void onMessage(String message) {

        POPOrderDeliveredMq mq = JSON.parseObject(message, POPOrderDeliveredMq.class);

        mq.getUId();
        mq.getOrderId();
        mq.getOrderTime();

        // ... 处理自己的业务
    }
}
