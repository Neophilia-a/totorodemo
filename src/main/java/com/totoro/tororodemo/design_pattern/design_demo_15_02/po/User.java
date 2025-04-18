package com.totoro.tororodemo.design_pattern.design_demo_15_02.po;

import lombok.Data;

import java.sql.Date;

@Data
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private Date createTime;
    private Date updateTime;

}
