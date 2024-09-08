package com.totoro.tororodemo.design_pattern.design_demo_12_00;

import lombok.Data;

/**
 * 功能：返回对象定义
 *
 * @author zhenghang
 * @date 2024/9/7
 */
@Data
public class AuthInfo {
    private String code;
    private String info = "";

    public AuthInfo(String code, String ...infos) {
        this.code = code;
        for (String str:infos){
            this.info = this.info.concat(str);
        }
    }
}
