package com.totoro.tororodemo.design_pattern.design_demo_9_02.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/29
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoDoor {
    String key() default "";

    String returnJson() default "";
}
