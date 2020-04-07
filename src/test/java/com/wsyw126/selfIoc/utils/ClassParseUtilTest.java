package com.wsyw126.selfIoc.utils;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ClassParseUtilTest {

    @Test
    void getClasses() {
        Set<Class<?>> classes = ClassParseUtil.getClasses("com.wsyw126.selfIoc");
        System.out.println(JSON.toJSONString(classes));
    }
}