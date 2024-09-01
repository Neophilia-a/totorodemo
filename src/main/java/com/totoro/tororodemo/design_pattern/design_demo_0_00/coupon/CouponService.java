package com.totoro.tororodemo.design_pattern.design_demo_0_00.coupon;

/**
 * 功能：优惠卷服务
 *
 * @author zhenghang
 * @date 2024/7/29
 */
public class CouponService {
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
