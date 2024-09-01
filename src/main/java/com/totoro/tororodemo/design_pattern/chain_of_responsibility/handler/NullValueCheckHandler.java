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
public class NullValueCheckHandler extends AbstractCheckHandler{
    @Override
    public String handle(HeavyTeamVO heavyTeamVO) {
        System.out.println("开始空值校验");
        // 如果配置了降级，则跳过该处理器
        if (super.getConfig().getDown()) {
            System.out.println("空值校验 已经降级 不参与校验。。。。");
            return super.next(heavyTeamVO);
        }
        if (Objects.isNull(heavyTeamVO.getId())) {
            return "id 不能为空";
        }
        if (Objects.isNull(heavyTeamVO.getTeamCn())) {
            return "名字 不能为空";
        }
        System.out.println("结束空值校验");
        return super.next(heavyTeamVO);
    }
}
