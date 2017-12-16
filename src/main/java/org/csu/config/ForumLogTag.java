package org.csu.config;

import java.lang.annotation.*;

/**
 * @author by bixi.lx
 * @created on 2017 12 16 23:17
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ForumLogTag {

    String value();
}
