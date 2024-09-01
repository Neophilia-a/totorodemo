package com.totoro.tororodemo.design_pattern.design_demo_0_00.goods;

import com.alibaba.fastjson.JSON;

/**
 * 功能：实物商品服务
 *
 * @author zhenghang
 * @date 2024/7/29
 */
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
