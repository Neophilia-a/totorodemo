package com.totoro.tororodemo.design_pattern.design_demo_0_02.store.impl;

import com.alibaba.fastjson.JSON;
import com.totoro.tororodemo.design_pattern.design_demo_0_00.card.IQiYiCardService;
import com.totoro.tororodemo.design_pattern.design_demo_0_02.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 功能：爱奇艺奖品发放实现类
 *
 * @author zhenghang
 * @date 2024/7/29
 */
public class CardCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    // 模拟注入
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
