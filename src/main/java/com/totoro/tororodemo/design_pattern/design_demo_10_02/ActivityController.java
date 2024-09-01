package com.totoro.tororodemo.design_pattern.design_demo_10_02;


import com.totoro.tororodemo.design_pattern.design_demo_10_02.utils.RedisUtils;

/**
 * 功能：redis模拟工具类
 *
 * @author zhenghang
 * @date 2024/9/1
 */
public class ActivityController {

    private RedisUtils redisUtils = new RedisUtils();

    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }
}
