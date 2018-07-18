package com.yy.annotion;


import java.lang.annotation.*;

/**
 * 定义RequestMapping注解，用于标注服务类
 */
@Target(ElementType.METHOD)   //表示我们的注解是用在方法上面的
@Retention(RetentionPolicy.RUNTIME)   //解析的时候时运行
@Documented
public @interface RequestMapping {
    String value() default "";
}
