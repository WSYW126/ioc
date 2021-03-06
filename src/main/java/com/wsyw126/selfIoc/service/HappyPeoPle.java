/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.wsyw126.selfIoc.service;

import com.wsyw126.selfIoc.annotation.SelfAutowired;
import com.wsyw126.selfIoc.annotation.SelfService;

/**
 * @author yangjunpeng
 * @version $Id: HappyPeoPle.java, v 0.1 2020年04月07日 下午2:34 yangjunpeng Exp $
 */
@SelfService
public class HappyPeoPle implements People {
    @SelfAutowired
    private Work workImpl;

    @Override
    public void say() {
        System.out.println("I am very happy");
        workImpl.work(10);
    }
}