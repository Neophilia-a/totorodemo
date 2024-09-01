package com.totoro.tororodemo.design_pattern.design_demo_9_02.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/29
 */
@ConfigurationProperties("totoro.door")
public class StarterServiceProperties {
    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }
}
