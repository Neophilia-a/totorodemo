package com.totoro.tororodemo.design_pattern.design_demo_5_02.impl;

import com.totoro.tororodemo.design_pattern.design_demo_5_00.service.OrderService;
import com.totoro.tororodemo.design_pattern.design_demo_5_02.IOrderAdapterService;

/**
 * 功能：内部商品接口
 *
 * @author zhenghang
 * @date 2024/8/11
 */
public class InsideOrderServiceImpl implements IOrderAdapterService {

    private OrderService orderService = new OrderService();
    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
