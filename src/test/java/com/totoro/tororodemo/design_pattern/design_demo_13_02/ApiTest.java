package com.totoro.tororodemo.design_pattern.design_demo_13_02;

import com.totoro.tororodemo.design_pattern.design_demo_13_02.cook.impl.GuangDongCook;
import com.totoro.tororodemo.design_pattern.design_demo_13_02.cook.impl.JiangSuCook;
import com.totoro.tororodemo.design_pattern.design_demo_13_02.cook.impl.ShanDongCook;
import com.totoro.tororodemo.design_pattern.design_demo_13_02.cook.impl.SiChuanCook;
import com.totoro.tororodemo.design_pattern.design_demo_13_02.cuisine.ICuisine;
import com.totoro.tororodemo.design_pattern.design_demo_13_02.cuisine.impl.GuangDoneCuisine;
import com.totoro.tororodemo.design_pattern.design_demo_13_02.cuisine.impl.JiangSuCuisine;
import com.totoro.tororodemo.design_pattern.design_demo_13_02.cuisine.impl.ShanDongCuisine;
import com.totoro.tororodemo.design_pattern.design_demo_13_02.cuisine.impl.SiChuanCuisine;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/9/9
 */
public class ApiTest {
    @Test
    public void test(){

        // 菜系 + 厨师；广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        ICuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
        ICuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        ICuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
        ICuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());

        // 点单
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.order(shanDongCuisine);
        xiaoEr.order(siChuanCuisine);

        // 下单
        xiaoEr.placeOrder();

    }
}
