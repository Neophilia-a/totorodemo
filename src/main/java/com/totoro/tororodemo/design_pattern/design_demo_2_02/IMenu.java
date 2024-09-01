package com.totoro.tororodemo.design_pattern.design_demo_2_02;

import com.totoro.tororodemo.design_pattern.design_demo_2_00.Matter;

/**
 * 装修菜单接口
 *
 * @author zhenghang
 * @date 2024/8/4
 */
public interface IMenu {

    /**
     * 吊顶
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     */
    String getDetail();
}
