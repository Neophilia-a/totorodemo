package com.totoro.tororodemo.design_pattern.design_demo_10_02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能：库存
 *
 * @author zhenghang
 * @date 2024/9/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    private int total; // 库存总量
    private int used;  // 库存已用
}
