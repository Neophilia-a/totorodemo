package com.totoro.tororodemo.design_pattern.design_demo_13_02;

import com.totoro.tororodemo.design_pattern.design_demo_13_02.cuisine.ICuisine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/9/9
 */
public class XiaoEr {

    private Logger logger = LoggerFactory.getLogger(XiaoEr.class);

    private List<ICuisine> cuisineList = new ArrayList<>();

    public void order(ICuisine cuisine) {
        cuisineList.add(cuisine);
    }

    public synchronized void placeOrder() {
        for (ICuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }
}
