package com.totoro.tororodemo.design_pattern.chain_of_responsibility.handler;

import com.totoro.tororodemo.design_pattern.chain_of_responsibility.vo.HeavyTeamVO;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/4/13
 */
@Component
public class TeamStatusCheckHandler extends AbstractCheckHandler{
    @Override
    public String handle(HeavyTeamVO heavyTeamVO) {
        System.out.println("开始校验状态");
        if (super.getConfig().getDown()) {
            System.out.println("已经降级 不校验状态");
            return super.next(heavyTeamVO);
        }
        if (Objects.isNull(heavyTeamVO.getTeamStatus()) && 0 == heavyTeamVO.getTeamStatus()) {
            return "状态不对";
        }
        System.out.println("结束校验状态");
        return super.next(heavyTeamVO);
    }
}
