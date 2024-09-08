package com.totoro.tororodemo.design_pattern.design_demo_11_00;

import com.totoro.tororodemo.design_pattern.design_demo_11_00.agent.Select;

/**
 * 功能：用户dao层数据
 *
 * @author zhenghang
 * @date 2024/9/4
 */
public interface IUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);
}
