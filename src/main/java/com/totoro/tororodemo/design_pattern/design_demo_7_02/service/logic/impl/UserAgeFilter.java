package com.totoro.tororodemo.design_pattern.design_demo_7_02.service.logic.impl;

import com.totoro.tororodemo.design_pattern.design_demo_7_02.service.logic.BaseLogic;

import java.util.Map;

/**
 * 功能：用户年龄过滤器
 *
 * @author zhenghang
 * @date 2024/8/20
 */
public class UserAgeFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
