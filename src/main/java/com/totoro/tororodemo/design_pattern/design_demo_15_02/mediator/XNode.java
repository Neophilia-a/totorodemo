package com.totoro.tororodemo.design_pattern.design_demo_15_02.mediator;

import lombok.Data;

import java.util.Map;

@Data
public class XNode {

    private String namespace;
    private String id;
    private String parameterType;
    private String resultType;
    private String sql;
    private Map<Integer, String> parameter;
}