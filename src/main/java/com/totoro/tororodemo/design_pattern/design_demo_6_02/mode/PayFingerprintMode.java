package com.totoro.tororodemo.design_pattern.design_demo_6_02.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能：指纹支付
 *
 * @author zhenghang
 * @date 2024/8/14
 */
public class PayFingerprintMode implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    @Override
    public boolean security(String uId) {
        logger.info("指纹支付，风控校验指纹信息");
        return true;
    }
}
