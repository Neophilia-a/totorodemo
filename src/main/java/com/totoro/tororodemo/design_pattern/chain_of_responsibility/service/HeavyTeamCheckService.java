package com.totoro.tororodemo.design_pattern.chain_of_responsibility.service;

import com.alibaba.fastjson.JSON;
import com.totoro.tororodemo.design_pattern.chain_of_responsibility.Client.HandlerClient;
import com.totoro.tororodemo.design_pattern.chain_of_responsibility.handler.AbstractCheckHandler;
import com.totoro.tororodemo.design_pattern.chain_of_responsibility.vo.HeavyTeamVO;
import com.totoro.tororodemo.design_pattern.chain_of_responsibility.config.HeavyTeamCheckHandleConfig;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/4/13
 */
@Service
public class HeavyTeamCheckService {

    @Resource
    private Map<String, AbstractCheckHandler> handlerMap;



    public String createHT(HeavyTeamVO heavyTeamVO) {
        return this.paramCheck(heavyTeamVO);
    }

    /**
     * 责任链模式的参数校验
     *
     * @param heavyTeamVO
     * @return
     */
    private String paramCheck(HeavyTeamVO heavyTeamVO) {
        // 获取处理器配置，一般配置在配置中心
        HeavyTeamCheckHandleConfig handleConfig = this.getHandlerConfigFile();

        // 获取处理器
        AbstractCheckHandler handler = this.getHandler(handleConfig);

        return HandlerClient.executeChain(handler, heavyTeamVO);
    }


    private HeavyTeamCheckHandleConfig getHandlerConfigFile() {
        String configJson = "{\"handlerBeanName\":\"nullValueCheckHandler\",\"down\":false,\"next\":{\"handlerBeanName\":\"teamStatusCheckHandler\",\"next\":null}}";
        //转成Config对象
        HeavyTeamCheckHandleConfig handlerConfig = JSON.parseObject(configJson, HeavyTeamCheckHandleConfig.class);
        return handlerConfig;
    }

    /**
     * 获取处理器
     *
     * @param config 处理器配置
     * @return
     */
    private AbstractCheckHandler getHandler(HeavyTeamCheckHandleConfig config) {
        // 检查配置，没有对应配置则不进行链路校验
        if (Objects.isNull(config)) {
            return null;
        }


        String handler = config.getHandlerBeanName();
        // 配置错误返回null
        if (Objects.isNull(handler) || Objects.equals(handler, "")) {
            return null;
        }

        AbstractCheckHandler abstractCheckHandler = handlerMap.get(config.getHandlerBeanName());
        // 配置了不存在的处理器
        if (Objects.isNull(abstractCheckHandler)) {
            return null;
        }

        // 处理器设置配置
        abstractCheckHandler.setConfig(config);

        // 递归设置链路处理器
        abstractCheckHandler.setNexthandler(this.getHandler(config.getNext()));

        return abstractCheckHandler;
    }
}
