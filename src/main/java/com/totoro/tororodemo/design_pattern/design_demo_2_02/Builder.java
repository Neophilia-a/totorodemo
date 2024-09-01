package com.totoro.tororodemo.design_pattern.design_demo_2_02;

import com.totoro.tororodemo.design_pattern.design_demo_2_00.celling.LevelOneCeiling;
import com.totoro.tororodemo.design_pattern.design_demo_2_00.celling.LevelTwoCeiling;
import com.totoro.tororodemo.design_pattern.design_demo_2_00.coat.DuluxCoat;
import com.totoro.tororodemo.design_pattern.design_demo_2_00.coat.LiBangCoat;
import com.totoro.tororodemo.design_pattern.design_demo_2_00.floor.ShengXiangFloor;
import com.totoro.tororodemo.design_pattern.design_demo_2_00.tile.DongPengTile;
import com.totoro.tororodemo.design_pattern.design_demo_2_00.tile.MarcoPoloTile;

import java.math.BigDecimal;

/**
 * 修建者
 *
 * @author zhenghang
 * @date 2024/8/4
 */
public class Builder {

    public IMenu levelOne(BigDecimal area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(BigDecimal area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(BigDecimal area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }
}
