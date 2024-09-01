package com.totoro.tororodemo.design_pattern.design_demo_2_00;

import java.math.BigDecimal;

/**
 * 功能：装修物料
 *
 * @author zhenghang
 * @date 2024/8/4
 */
public interface Matter {
    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    String scene();

    /**
     * 品牌
     */
    String brand();

    /**
     * 型号
     */
    String model();

    /**
     * 平米报价
     */
    BigDecimal price();

    /**
     * 描述
     */
    String desc();
}
