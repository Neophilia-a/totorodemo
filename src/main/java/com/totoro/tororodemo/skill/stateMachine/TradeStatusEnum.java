package com.totoro.tororodemo.skill.stateMachine;

import lombok.Getter;

/**
 * 功能：订单状态枚举类
 *
 * @author toroto
 * @date 2025/4/18/周五
 */
@Getter
public enum TradeStatusEnum {
 
    /**
     * 新建订单
     */
    NEW("NEW", "新建订单"),
 
    /**
     * 锁单成功-待支付状态
     */
    WAIT_PAY("WAIT_PAY", "待支付"),
 
    /**
     * 支付成功
     */
    PAY_SUCCESS("PAY_SUCCESS", "支付成功"),
 
    /**
     * 已完成
     */
    COMPLETED("COMPLETED","已完成"),
 
    /**
     * 已取消
     */
    CANCELLED("CANCELLED","已取消"),
 
    /**
     * 订单关闭
     */
    CLOSED("CLOSED","订单关闭");
    private String status;
    private String desc;
 
    TradeStatusEnum(String status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}