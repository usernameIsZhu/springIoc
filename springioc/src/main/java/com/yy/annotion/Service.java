package com.yy.annotion;


import java.lang.annotation.*;

/**
 * 定义Service注解，用于标注服务类
 */
@Target(ElementType.TYPE)   //表示我们的注解是用在类上面的
@Retention(RetentionPolicy.RUNTIME)   //解析的时候时运行
@Documented
public @interface Service {
    String value() default "";
}
