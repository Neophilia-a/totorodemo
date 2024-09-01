package com.totoro.tororodemo.design_pattern.design_demo_7_02.model.aggregates;

import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.vo.TreeNode;
import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.vo.TreeRoot;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

/**
 * 功能：规则树聚合
 *
 * @author zhenghang
 * @date 2024/8/20
 */
@Data
@AllArgsConstructor
public class TreeRich {
    private TreeRoot treeRoot;                          //树根信息
    private Map<Long, TreeNode> treeNodeMap;        //树节点ID -> 子节点
}
