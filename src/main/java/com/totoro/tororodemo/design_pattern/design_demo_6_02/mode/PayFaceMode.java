package com.totoro.tororodemo.design_pattern.design_demo_6_02.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能：刷脸支付
 *
 * @author zhenghang
 * @date 2024/8/14
 */
public class PayFaceMode implements IPayMode{
    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);
    @Override
    public boolean security(String uId) {
        logger.info("人脸支付，风控校验脸部识别");
        return true;
    }
}
