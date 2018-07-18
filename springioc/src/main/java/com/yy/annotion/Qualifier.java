package com.yy.annotion;


import java.lang.annotation.*;

/**
 * 定义Qualifer注解
 */
@Target(ElementType.FIELD)   //表示我们的注解是用在变量上面的
@Retention(RetentionPolicy.RUNTIME)   //解析的时候时运行
@Documented                            //文档
public @interface Qualifier {
    String value() default "";
}
