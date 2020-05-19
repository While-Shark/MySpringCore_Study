package com.base.spring.section_1_8_2.beanfactorypostprocessor.propertysourcesplaceholderconfigurer;

import com.base.spring.section_1_8_2.beanfactorypostprocessor.pojo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        ac.setConfigLocation("com/base/spring/section_1_8_2/beanfactorypostprocessor/xmlfiles/placeholderConfigurer.xml");
        ac.refresh();

        MyBasticSource dataSource = (MyBasticSource) ac.getBean("dataSource");
        System.out.println(dataSource.toString());


        Person person = (Person) ac.getBean("person");
        System.out.println(person.toString());

        ac.close();
    }

}
