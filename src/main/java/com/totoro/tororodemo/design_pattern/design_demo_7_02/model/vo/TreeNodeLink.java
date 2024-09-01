package com.totoro.tororodemo.design_pattern.design_demo_7_02.model.vo;

import lombok.Data;

/**
 * 功能：规则树线信息
 *
 * @author zhenghang
 * @date 2024/8/20
 */
@Data
public class TreeNodeLink {
    private Long nodeIdFrom;        //节点From
    private Long nodeIdTo;          //节点To
    private Integer ruleLimitType;  //限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]
    private String ruleLimitValue;  //限定值
}
