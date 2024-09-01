package com.totoro.tororodemo.design_pattern.design_demo_5_00.mq;

import lombok.Data;

import java.util.Date;

/**
 * 功能：内部订单mq
 *
 * @author zhenghang
 * @date 2024/8/11
 */
@Data
public class OrderMq {
    private String uid;           // 用户ID
    private String sku;           // 商品
    private String orderId;       // 订单ID
    private Date createOrderTime; // 下单时间
}
