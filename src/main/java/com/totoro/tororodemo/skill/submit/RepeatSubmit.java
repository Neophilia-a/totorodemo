package com.totoro.tororodemo.skill.submit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能：重复提交注解
 *
 * @author zhenghang
 * @date 2024/8/8
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatSubmit {
    // 枚举 根据参数 或者 token 进行辨别重复提交
    enum Type {PARAM, TOKEN}

    // 默认参数类型
    Type limitType() default Type.PARAM;

    // 几秒内禁止重复提交 默认5秒
    long lockTime() default 5;
}
