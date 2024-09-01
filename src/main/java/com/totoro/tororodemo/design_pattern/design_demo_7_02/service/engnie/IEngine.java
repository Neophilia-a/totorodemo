package com.totoro.tororodemo.design_pattern.design_demo_7_02.service.engnie;

import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.aggregates.TreeRich;
import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.vo.EngineResult;

import java.util.Map;

/**
 * 功能：决策引擎接口定义
 *
 * @author zhenghang
 * @date 2024/8/20
 */
public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
