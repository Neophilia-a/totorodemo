package com.totoro.tororodemo.design_pattern.design_demo_6_02;

import com.totoro.tororodemo.design_pattern.design_demo_6_02.channel.Pay;
import com.totoro.tororodemo.design_pattern.design_demo_6_02.channel.WxPay;
import com.totoro.tororodemo.design_pattern.design_demo_6_02.channel.ZfbPay;
import com.totoro.tororodemo.design_pattern.design_demo_6_02.mode.PayFaceMode;
import com.totoro.tororodemo.design_pattern.design_demo_6_02.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/14
 */
public class ApiTest {
    @Test
    public void test_pay() {

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));

    }
}
