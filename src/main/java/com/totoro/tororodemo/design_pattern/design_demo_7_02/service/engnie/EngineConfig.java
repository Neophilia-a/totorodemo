package com.totoro.tororodemo.design_pattern.design_demo_7_02.service.engnie;

import com.totoro.tororodemo.design_pattern.design_demo_7_02.service.logic.LogicFilter;
import com.totoro.tororodemo.design_pattern.design_demo_7_02.service.logic.impl.UserAgeFilter;
import com.totoro.tororodemo.design_pattern.design_demo_7_02.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 功能：决策点配置
 *
 * @author zhenghang
 * @date 2024/8/20
 */
public class EngineConfig {
    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        this.logicFilterMap = logicFilterMap;
    }
}
