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
public class JiangSuCook implements ICook {

    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("江苏厨师，烹饪苏菜，宫廷第二大菜系，古今国宴上最受人欢迎的菜系。");
    }
}
