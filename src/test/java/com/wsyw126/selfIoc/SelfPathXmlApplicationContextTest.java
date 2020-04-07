package com.wsyw126.selfIoc;

import com.wsyw126.selfIoc.service.HappyPeoPle;
import com.wsyw126.selfIoc.service.SadPeoPle;
import org.junit.jupiter.api.Test;

class SelfPathXmlApplicationContextTest {
    @Test
    void contextLoads() {
        try {
            SelfPathXmlApplicationContext app = new SelfPathXmlApplicationContext("com.wsyw126.selfIoc");
            SadPeoPle sadPeoPle = (SadPeoPle) app.getBean("sadPeoPle");
            sadPeoPle.say();
            System.out.println("当前的bean的实例对象是: " + sadPeoPle);

            System.out.println();

            HappyPeoPle happyPeoPle = (HappyPeoPle) app.getBean("happyPeoPle");
            happyPeoPle.say();
            System.out.println("当前的bean的实例对象是: " + happyPeoPle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}