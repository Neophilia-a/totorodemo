package com.totoro.tororodemo.design_pattern.design_demo_9_02.config;

/**
 * 功能：配置服务类
 *
 * @author zhenghang
 * @date 2024/8/29
 */
public class StarterService {
    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return this.userStr.split(separatorChar);
    }
}
