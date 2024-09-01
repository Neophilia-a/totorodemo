package com.totoro.tororodemo.design_pattern.design_demo_5_00.mq;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能：第三方订单mq
 *
 * @author zhenghang
 * @date 2024/8/11
 */
@Data
public class POPOrderDeliveredMq {
    private String uId;     // 用户ID
    private String orderId; // 订单号
    private Date orderTime; // 下单时间
    private Date sku;       // 商品
    private Date skuName;   // 商品名称
    private BigDecimal decimal; // 金额
}
