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
public class SiChuanCook implements ICook {

    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("四川厨师，烹饪川菜，中国最有特色的菜系，也是民间最大菜系。");
    }
}
