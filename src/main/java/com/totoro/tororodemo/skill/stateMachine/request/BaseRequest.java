package com.totoro.tororodemo.skill.stateMachine.request;

import com.totoro.tororodemo.skill.stateMachine.TradeStatusEnum;

/**
 * 功能：状态机基础请求
 *
 * @author toroto
 * @date 2025/4/18/周五
 */
public abstract class BaseRequest {
 
 
    public abstract TradeStatusEnum getTradeStatus();
}