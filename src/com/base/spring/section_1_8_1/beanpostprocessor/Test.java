package com.base.spring.section_1_8_1.beanpostprocessor;

import com.base.spring.section_1_8_1.beanpostprocessor.pojo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_8_1/beanpostprocessor/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");
       /* Person person = (Person) ac.getBean("person");
        Person person1 = (Person) ac.getBean("person1");
        System.out.println(person1);*/
       //在InstantiationTracingBeanPostProcessor类中覆盖了实例
        Person per = (Person) ac.getBean("student");
        System.out.println(per.toString());

    }

}
