package com.base.spring.section_1_10_3.automaticallyDetecting.config;

import com.base.spring.section_1_10_3.automaticallyDetecting.mydemo.MovieFinder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Configuration
//@ComponentScan(basePackages = "com.base.spring.section_1_10_3.automaticallyDetecting")
public class AppConfig {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_10_3/automaticallyDetecting/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");

        MovieFinder bean = ac.getBean(MovieFinder.class);
        System.out.println(bean);
        bean.find();
    }

}
