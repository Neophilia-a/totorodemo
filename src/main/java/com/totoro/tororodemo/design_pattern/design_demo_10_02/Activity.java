package com.totoro.tororodemo.design_pattern.design_demo_10_02;

import lombok.Data;

import java.util.Date;

/**
 * 功能：活动信息
 *
 * @author zhenghang
 * @date 2024/9/1
 */
@Data
public class Activity {
    private Long id;        // 活动ID
    private String name;    // 活动名称
    private String desc;    // 活动描述
    private Date startTime; // 开始时间
    private Date stopTime;  // 结束时间
    private Stock stock;    // 活动库存
}
