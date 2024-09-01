package com.totoro.tororodemo.design_pattern.chain_of_responsibility.handler;

import com.totoro.tororodemo.design_pattern.chain_of_responsibility.vo.HeavyTeamVO;
import com.totoro.tororodemo.design_pattern.chain_of_responsibility.config.HeavyTeamCheckHandleConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 功能：抽象类校验处理器
 *
 * @author zhenghang
 * @date 2024/4/13
 */
@Component
public abstract class AbstractCheckHandler {

    /**
     * 当前处理器持有的下一个处理器引用
     */
    @Getter
    @Setter
    protected AbstractCheckHandler nexthandler;

    /**
     * 处理器配置
     */
    @Getter
    @Setter
    protected HeavyTeamCheckHandleConfig config;

    /**
     * 处理器执行方法
     *
     * @param heavyTeamVO 参数
     * @return 处理结果
     */
    public abstract String handle(HeavyTeamVO heavyTeamVO);

    /**
     * 链路传递
     *
     * @param heavyTeamVO 参数
     * @return 执行处理结果
     */
    protected String next(HeavyTeamVO heavyTeamVO) {
        // 没有对应处理器 直接返回
        if (Objects.isNull(nexthandler)) {
            return "成功";
        }
        // 执行下一个处理器
        return nexthandler.handle(heavyTeamVO);
    }

}
