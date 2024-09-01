package com.totoro.tororodemo.design_pattern.design_demo_0_00.card;

/**
 * 功能：爱奇艺卡片服务
 *
 * @author zhenghang
 * @date 2024/7/29
 */
public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
