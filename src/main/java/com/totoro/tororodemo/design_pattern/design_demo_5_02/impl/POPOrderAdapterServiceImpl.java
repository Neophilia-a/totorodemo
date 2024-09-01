package com.totoro.tororodemo.design_pattern.design_demo_5_02.impl;

import com.totoro.tororodemo.design_pattern.design_demo_5_00.service.POPOrderService;
import com.totoro.tororodemo.design_pattern.design_demo_5_02.IOrderAdapterService;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/11
 */
public class POPOrderAdapterServiceImpl implements IOrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
