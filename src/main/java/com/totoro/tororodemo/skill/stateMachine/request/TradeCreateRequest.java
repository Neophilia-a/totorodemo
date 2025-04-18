package com.totoro.tororodemo.skill.stateMachine.request;

import com.totoro.tororodemo.skill.stateMachine.TradeStatusEnum;

/**
 * 功能：请求创建类
 *
 * @author toroto
 * @date 2025/4/18/周五
 */
public class TradeCreateRequest extends BaseRequest {
 
    @Override
    public TradeStatusEnum getTradeStatus(){
        return TradeStatusEnum.NEW;
    }
}