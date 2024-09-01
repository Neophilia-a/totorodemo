package com.totoro.tororodemo.design_pattern.design_demo_7_02.service.engnie.impl;

import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.aggregates.TreeRich;
import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.vo.EngineResult;
import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.vo.TreeNode;
import com.totoro.tororodemo.design_pattern.design_demo_7_02.service.engnie.EngineBase;

import java.util.Map;

/**
 * 功能：决策引擎实现
 *
 * @author zhenghang
 * @date 2024/8/20
 */
public class TreeEngineHandle extends EngineBase {
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
