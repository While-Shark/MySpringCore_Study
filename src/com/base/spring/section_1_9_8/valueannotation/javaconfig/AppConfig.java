package com.base.spring.section_1_9_8.valueannotation.javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:com/base/spring/section_1_9_8/valueannotation/xmlfiles/application.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    //使用java配置
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_9_8/valueannotation/xmlfiles/appConfig.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");

        MovieRecommender bean = ac.getBean(MovieRecommender.class);
        System.out.println(bean);
    }


}
