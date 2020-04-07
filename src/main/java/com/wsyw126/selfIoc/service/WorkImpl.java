/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.wsyw126.selfIoc.service;

import com.wsyw126.selfIoc.annotation.SelfService;

/**
 * @author yangjunpeng
 * @version $Id: Work.java, v 0.1 2020年04月07日 下午2:38 yangjunpeng Exp $
 */
@SelfService
public class WorkImpl implements Work{

    @Override
    public void work(int n) {
        System.out.println("work " + n + " times。");
    }
}