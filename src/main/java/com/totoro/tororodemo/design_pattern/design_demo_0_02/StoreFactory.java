package com.totoro.tororodemo.design_pattern.design_demo_0_02;

import com.totoro.tororodemo.design_pattern.design_demo_0_02.store.ICommodity;
import com.totoro.tororodemo.design_pattern.design_demo_0_02.store.impl.CardCommodityService;
import com.totoro.tororodemo.design_pattern.design_demo_0_02.store.impl.CouponCommodityService;
import com.totoro.tororodemo.design_pattern.design_demo_0_02.store.impl.GoodsCommodityService;

/**
 * 功能：商品工厂
 *
 * @author zhenghang
 * @date 2024/7/29
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
