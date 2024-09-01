package com.totoro.tororodemo.design_pattern.design_demo_5_00.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能：查询用户订单下载数量
 *
 * @author zhenghang
 * @date 2024/8/11
 */
public class OrderService {
    private Logger logger = LoggerFactory.getLogger(OrderService.class);

    public long queryUserOrderCount(String userId){
        logger.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }
}
