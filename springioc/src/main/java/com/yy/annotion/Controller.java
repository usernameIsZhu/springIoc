package com.yy.annotion;

import java.lang.annotation.*;

/**
 * 定义controller注解，用于标注控制器类
 */
@Target(ElementType.TYPE)   //表示我们的注解是用在类上面的
@Retention(RetentionPolicy.RUNTIME)   //解析时候时运行
@Documented
public @interface Controller {   //定义了controller的注解
    String value() default "";       //默认值
}
