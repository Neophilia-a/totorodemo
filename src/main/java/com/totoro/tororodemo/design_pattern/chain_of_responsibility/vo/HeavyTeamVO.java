package com.totoro.tororodemo.design_pattern.chain_of_responsibility.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/4/13
 */
@Data
@AllArgsConstructor
public class HeavyTeamVO {

    /**
     * 团队id
     */
    private Long id;

    /**
     * 团队中文名称
     */
    private String teamCn;

    /**
     * 团队英文名称
     */
    private String teamEn;

    /**
     * 团队状态 0失效 1有效
     */
    private Integer teamStatus;
}
