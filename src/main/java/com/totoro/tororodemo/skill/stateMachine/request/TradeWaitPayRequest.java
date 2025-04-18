package com.totoro.tororodemo.skill.stateMachine.request;

import com.totoro.tororodemo.skill.stateMachine.TradeStatusEnum;

/**
 * 功能订单待支付状态类
 *
 * @author toroto
 * @date 2025/4/18/周五
 */
public class TradeWaitPayRequest extends BaseRequest {

    @Override
    public TradeStatusEnum getTradeStatus() {
        return TradeStatusEnum.WAIT_PAY;
    }
}
