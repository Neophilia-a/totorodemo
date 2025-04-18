package com.totoro.tororodemo.skill.stateMachine;

/**
 * 功能：订单状态模型
 *
 * @author toroto
 * @date 2025/4/18/周五
 */
public class OrderStatusModel {
    private static StateMachine ORDEER_STATEMACHINE;
 
    static {
        ORDEER_STATEMACHINE = new StateMachine(new Transition[]{
                new Transition(TradeStatusEnum.NEW.getStatus(), TradeEventEnum.CONFIRM.name(), TradeStatusEnum.WAIT_PAY.getStatus()),
                new Transition(TradeStatusEnum.NEW.getStatus(), TradeEventEnum.CANCEL.name(), TradeStatusEnum.CLOSED.getStatus()),
                new Transition(TradeStatusEnum.WAIT_PAY.getStatus(), TradeEventEnum.PAY.name(), TradeStatusEnum.PAY_SUCCESS.getStatus()),
                new Transition(TradeStatusEnum.WAIT_PAY.getStatus(), TradeEventEnum.PAY_CANCEL.name(), TradeStatusEnum.CANCELLED.getStatus()),
                new Transition(TradeStatusEnum.PAY_SUCCESS.getStatus(), TradeEventEnum.CONFIRM_SUCCESS.name(), TradeStatusEnum.COMPLETED.getStatus())
        }
        );
    }
 
    public static String getTargetStatus(TradeStatusEnum currentStatus, TradeEventEnum tradeEventEnum) {
        return ORDEER_STATEMACHINE.getNextState(currentStatus.getStatus(), tradeEventEnum.name());
    }
 
 
 
}