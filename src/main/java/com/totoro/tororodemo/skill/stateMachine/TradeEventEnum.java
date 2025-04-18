package com.totoro.tororodemo.skill.stateMachine;

/**
 * 功能：订单事件枚举类
 *
 * @author toroto
 * @date 2025/4/18/周五
 */
public enum TradeEventEnum {
 
    /**
     * 订单确认
     */
    CONFIRM,
    /**
     * 取消订单
     */
    CANCEL,
    /**
     * 支付
     */
    PAY,
    /**
     * 支付取消
     */
    PAY_CANCEL,
    /**
     * 订单确认成功
     */
    CONFIRM_SUCCESS,
    /**
     * 订单完成
     */
    FINISH
}