package com.totoro.tororodemo.design_pattern.design_demo_6_02.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能：密码支付
 *
 * @author zhenghang
 * @date 2024/8/14
 */
public class PayCypher implements IPayMode{
    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    @Override
    public boolean security(String uId) {
        logger.info("密码支付，风控校验环境安全");
        return true;
    }
}
