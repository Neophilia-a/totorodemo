package com.totoro.tororodemo.design_pattern.design_demo_7_02.model.vo;

import lombok.Data;

/**
 * 功能：树根信息
 *
 * @author zhenghang
 * @date 2024/8/20
 */
@Data
public class TreeRoot {
    private Long treeId;         //规则树ID
    private Long treeRootNodeId; //规则树根ID
    private String treeName;     //规则树名称
}
