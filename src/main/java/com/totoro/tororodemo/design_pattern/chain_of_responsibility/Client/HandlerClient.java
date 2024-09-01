package com.totoro.tororodemo.design_pattern.chain_of_responsibility.Client;


import com.totoro.tororodemo.design_pattern.chain_of_responsibility.handler.AbstractCheckHandler;
import com.totoro.tororodemo.design_pattern.chain_of_responsibility.vo.HeavyTeamVO;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/4/13
 */
public class HandlerClient {
    public static String executeChain(AbstractCheckHandler handler, HeavyTeamVO heavyTeamVO) {
        // 执行处理器
        return handler.handle(heavyTeamVO);
    }
}
