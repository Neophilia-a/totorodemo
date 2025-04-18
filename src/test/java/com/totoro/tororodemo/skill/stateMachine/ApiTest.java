package com.totoro.tororodemo.skill.stateMachine;

import com.totoro.tororodemo.skill.stateMachine.request.TradeCreateRequest;
import com.totoro.tororodemo.skill.stateMachine.request.TradeWaitPayRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 功能：状态机 订单测试
 *
 * @author toroto
 * @date 2025/4/18/周五
 */
@SpringBootTest
public class ApiTest {

    @Test
    public void testTradeOrder() {
        TradeOrder tradeOrder = new TradeOrder();

        tradeOrder.confirm(new TradeCreateRequest());
        System.out.println(TradeStatusEnum.valueOf(tradeOrder.getStatus()).getDesc());
        tradeOrder.pay(new TradeWaitPayRequest());
        System.out.println(TradeStatusEnum.valueOf(tradeOrder.getStatus()).getDesc());

    }
}
