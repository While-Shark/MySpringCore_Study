package com.base.spring.section_1_9_3.primary.mypri;


import com.base.spring.section_1_8_3.factorybean.pojo.MyBean;
import com.base.spring.section_1_8_3.factorybean.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_9_3/primary/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");
        PrimaryTest pt = (PrimaryTest) ac.getBean("myPrimary");
        pt.sayMySelf();

    }

}
