/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.wsyw126.selfIoc.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 模拟@Autowired注解
 *
 * @author yangjunpeng
 * @version $Id: SelfAutowired.java, v 0.1 2020年04月07日 上午11:52 yangjunpeng Exp $
 */
@Target({TYPE, FIELD, METHOD})
@Retention(RUNTIME)
public @interface SelfAutowired {

}