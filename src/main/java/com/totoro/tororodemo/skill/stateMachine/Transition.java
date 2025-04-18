package com.totoro.tororodemo.skill.stateMachine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能：状态机状态
 *
 * @author toroto
 * @date 2025/4/18/周五
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transition {
    /**
     * 起始状态
     */
    private String from;

    /**
     * 动作
     */
    private String event;
 
    /**
     * 目标状态
     */
    private String to;
 
}