/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.wsyw126.selfIoc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解  service 注入bean容器
 *
 * @author yangjunpeng
 * @version $Id: SelfService.java, v 0.1 2020年04月07日 上午11:51 yangjunpeng Exp $
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SelfService {

}