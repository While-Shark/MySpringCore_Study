package com.base.spring.section_1_9_7.resourceannotation.mydemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_9_7/resourceannotation/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");

        //SimpleMovieLister bean = ac.getBean(SimpleMovieLister.class);
        MovieRecommender bean = ac.getBean(MovieRecommender.class);
        System.out.println(bean);
    }

}
