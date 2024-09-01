package com.totoro.tororodemo.design_pattern.design_demo_0_02.store;

import java.util.Map;

/**
 * 功能：获取奖品接口
 *
 * @author zhenghang
 * @date 2024/7/29
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
