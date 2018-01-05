package com.hexin.annotations;

import java.lang.annotation.*;

/**
 * @author huey
 * @Description : 标识日志
 * @Date Created in 16:10 2017/7/30
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LogAnnotation {
}
