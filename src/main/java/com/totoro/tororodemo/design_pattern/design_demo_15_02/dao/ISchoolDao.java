package com.totoro.tororodemo.design_pattern.design_demo_15_02.dao;


import com.totoro.tororodemo.design_pattern.design_demo_15_02.po.School;

public interface ISchoolDao {

    School querySchoolInfoById(Long treeId);
}
