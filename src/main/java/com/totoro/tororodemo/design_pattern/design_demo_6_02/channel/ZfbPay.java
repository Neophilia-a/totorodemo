package com.totoro.tororodemo.design_pattern.design_demo_6_02.channel;

import com.totoro.tororodemo.design_pattern.design_demo_6_02.mode.IPayMode;

import java.math.BigDecimal;

/**
 * 功能：支付宝支付
 *
 * @author zhenghang
 * @date 2024/8/14
 */
public class ZfbPay extends Pay{

    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uid, String tradeId, BigDecimal amount) {
        logger.info("模拟支付宝渠道支付划账开始。uId：{} tradeId：{} amount：{}", uid, tradeId, amount);
        boolean security = payMode.security(uid);
        logger.info("模拟支付宝渠道支付风控校验。uId：{} tradeId：{} security：{}", uid, tradeId, security);
        if (!security) {
            logger.info("模拟支付宝渠道支付划账拦截。uId：{} tradeId：{} amount：{}", uid, tradeId, amount);
            return "0001";
        }
        logger.info("模拟支付宝渠道支付划账成功。uId：{} tradeId：{} amount：{}", uid, tradeId, amount);
        return "0000";
    }
}
