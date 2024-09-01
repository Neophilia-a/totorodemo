package com.totoro.tororodemo.design_pattern.design_demo_7_02.service.logic;

import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * 功能：树节点逻辑过滤器接口
 *
 * @author zhenghang
 * @date 2024/8/20
 */
public interface LogicFilter {

    /**
     * 逻辑决策器
     *
     * @param matterValue          决策值
     * @param treeNodeLineInfoList 决策节点
     * @return 下一个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList);

    /**
     * 获取决策值
     *
     * @param decisionMatter 决策物料
     * @return 决策值
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
}
