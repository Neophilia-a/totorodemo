package com.totoro.tororodemo.design_pattern.chain_of_responsibility.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/4/13
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HeavyTeamCheckHandleConfig {
    /**
     * 处理器bean的名称
     */
    private String handlerBeanName;

    /**
     * 下一个处理器
     */
    private HeavyTeamCheckHandleConfig next;

    /**
     * 是否降级
     */
    private Boolean down = Boolean.FALSE;
}
