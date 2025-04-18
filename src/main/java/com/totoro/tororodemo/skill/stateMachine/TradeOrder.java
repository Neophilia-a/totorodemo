package com.totoro.tororodemo.skill.stateMachine;

import com.totoro.tororodemo.skill.stateMachine.request.TradeCreateRequest;
import com.totoro.tororodemo.skill.stateMachine.request.TradeWaitPayRequest;
import lombok.Data;

/**
 * 功能：订单状态机的使用
 *
 * @author toroto
 * @date 2025/4/18/周五
 */
@Data
public class TradeOrder {
 
    private String orderId;
    private String status;
    private double price;
 
 
    public TradeOrder confirm(TradeCreateRequest request) {
        this.setStatus(OrderStatusModel.
                getTargetStatus(request.getTradeStatus(), TradeEventEnum.CONFIRM));
        return this;
    }
 
 
    public TradeOrder pay(TradeWaitPayRequest request) {
        this.setStatus(OrderStatusModel.
                getTargetStatus(request.getTradeStatus(), TradeEventEnum.PAY));
        return this;
    }
}