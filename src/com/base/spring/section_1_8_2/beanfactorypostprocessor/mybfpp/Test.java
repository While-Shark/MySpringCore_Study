package com.base.spring.section_1_8_2.beanfactorypostprocessor.mybfpp;

import com.base.spring.section_1_8_2.beanfactorypostprocessor.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_8_2/beanfactorypostprocessor/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");
        Student per = (Student) ac.getBean("student");
        System.out.println(per.toString());

        //自定义BeanFactoryPostProcessor处理了，所以这里能获取到
        Object person1 = ac.getBean("person1");
        System.out.println(person1);

    }

}
