package com.totoro.tororodemo.design_pattern.design_demo_13_02.cook.impl;

import com.totoro.tororodemo.design_pattern.design_demo_13_02.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/9/9
 */
public class GuangDongCook implements ICook {
    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("广东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
    }
}
