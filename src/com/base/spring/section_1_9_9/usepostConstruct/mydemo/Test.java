package com.base.spring.section_1_9_9.usepostConstruct.mydemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/*@Configuration
@PropertySource("classpath:com/base/spring/section_1_9_8/valueannotation/xmlfiles/application.properties")*/
public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_9_9/usepostConstruct/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");

        CachingMovieLister bean = ac.getBean(CachingMovieLister.class);
        System.out.println(bean);

        ac.close();
    }

}
