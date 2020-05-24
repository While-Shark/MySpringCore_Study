package com.base.spring.section_1_9_5.GenericsasAutowiringQualifiers.mydemo;


import com.base.spring.section_1_9_2.autowiredannotation.mydemo.SimpleDemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_9_2/autowiredannotation/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");

        //ConstructDemo bean = ac.getBean(ConstructDemo.class);
        //SetterDemo bean = ac.getBean(SetterDemo.class);
        SimpleDemo bean = ac.getBean(SimpleDemo.class);
        System.out.println(bean);
        System.out.println(bean.getContext());
    }

}
