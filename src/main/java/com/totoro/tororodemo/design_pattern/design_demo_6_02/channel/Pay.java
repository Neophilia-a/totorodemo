package com.totoro.tororodemo.design_pattern.design_demo_6_02.channel;

import com.totoro.tororodemo.design_pattern.design_demo_6_02.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 功能：支付类型桥接抽象类
 *
 * @author zhenghang
 * @date 2024/8/14
 */
public abstract class Pay {

    protected Logger logger = LoggerFactory.getLogger(Pay.class);

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uid, String tradeId, BigDecimal amount);
}
