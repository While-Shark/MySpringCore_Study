package com.base.spring.test;

import com.base.spring.test.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");
        Person person = (Person) ac.getBean("person");
        Person person1 = (Person) ac.getBean("person1");
        System.out.println(person1);
    }

}
