package com.base.spring.section_1_9_8.valueannotation.mydemo;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*@Configuration
@PropertySource("classpath:com/base/spring/section_1_9_8/valueannotation/xmlfiles/application.properties")*/
public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_9_8/valueannotation/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");

        //MovieRecommender bean = ac.getBean(MovieRecommender.class);
        MovieFinder bean = ac.getBean(MovieFinder.class);
        System.out.println(bean);
    }

}
