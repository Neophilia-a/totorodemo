package com.totoro.tororodemo.design_pattern.design_demo_15_02.dao;

import com.totoro.tororodemo.design_pattern.design_demo_15_02.po.User;

public interface IUserDao {
    User queryUserInfoById(Long id);
}
