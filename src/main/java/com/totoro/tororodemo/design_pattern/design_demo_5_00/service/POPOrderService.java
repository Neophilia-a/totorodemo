package com.totoro.tororodemo.design_pattern.design_demo_5_00.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能：查询用户第三方下单 首单接口
 *
 * @author zhenghang
 * @date 2024/8/11
 */
public class POPOrderService {

    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String uId) {
        logger.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }
}
