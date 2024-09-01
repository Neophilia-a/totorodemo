package com.totoro.tororodemo.design_pattern.design_demo_5_00.mq;

import lombok.Data;

import java.util.Date;

/**
 * 功能：账户
 *
 * @author zhenghang
 * @date 2024/8/11
 */
@Data
public class AccountMq {
    private String number;      // 开户编号
    private String address;     // 开户地
    private Date accountDate;   // 开户时间
    private String desc;        // 开户描述
}
