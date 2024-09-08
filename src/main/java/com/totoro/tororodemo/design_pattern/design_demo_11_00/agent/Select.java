package com.totoro.tororodemo.design_pattern.design_demo_11_00.agent;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {

    String value() default "";

}