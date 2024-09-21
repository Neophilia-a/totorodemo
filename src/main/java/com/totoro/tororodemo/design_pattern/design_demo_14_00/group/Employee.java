package com.totoro.tororodemo.design_pattern.design_demo_14_00.group;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 功能：雇员信息
 *
 * @author zhenghang
 * @date 2024/9/21
 */
@Data
@AllArgsConstructor
public class Employee {
    private String uId;   // ID
    private String name;  // 姓名
    private String desc;  // 备注
}
