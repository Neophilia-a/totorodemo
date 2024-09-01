package com.totoro.tororodemo.design_pattern.design_demo_0_01;

/**
 * 功能：奖品信息结果类
 *
 * @author zhenghang
 * @date 2024/7/29
 */
public class AwardRes {
    private String code; // 编码
    private String info; // 描述

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
