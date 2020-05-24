package com.base.spring.section_1_9_4.customqualifierannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//自定义限定符注解
public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
                "com/base/spring/section_1_9_4/customqualifierannotations/xmlfiles/beans.xml");

        SimpleDemo bean = ac.getBean(SimpleDemo.class);
        System.out.println(bean);
        System.out.println(bean.getBetterStudent());
        System.out.println(bean.getGoodStudent());

    }

}
