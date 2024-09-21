package com.totoro.tororodemo.design_pattern.design_demo_13_02.cuisine.impl;

import com.totoro.tororodemo.design_pattern.design_demo_13_02.cook.ICook;
import com.totoro.tororodemo.design_pattern.design_demo_13_02.cuisine.ICuisine;

/**
 * 功能：川菜
 *
 * @author zhenghang
 * @date 2024/9/9
 */
public class SiChuanCuisine implements ICuisine {

    private ICook cook;

    public SiChuanCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
