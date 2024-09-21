package com.totoro.tororodemo.design_pattern.design_demo_14_00.group;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 功能：树节点链路
 *
 * @author zhenghang
 * @date 2024/9/21
 */
@Data
@AllArgsConstructor
public class Link {
    private String fromId; // 雇员ID
    private String toId;   // 雇员ID
}
