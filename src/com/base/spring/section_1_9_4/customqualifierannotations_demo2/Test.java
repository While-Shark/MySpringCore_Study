package com.base.spring.section_1_9_4.customqualifierannotations_demo2;

import com.base.spring.section_1_9_4.customqualifierannotations.SimpleDemo;
import com.base.spring.section_1_9_4.customqualifierannotations_demo2.pojo.MovieRecommender;
import com.base.spring.section_1_9_4.customqualifierannotations_demo2.service.impl.SimpleMovieCatalog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//自定义限定符注解
public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
                "com/base/spring/section_1_9_4/customqualifierannotations_demo2/xmlfiles/beans.xml");

        MovieRecommender bean = ac.getBean(MovieRecommender.class);
        System.out.println(bean);

    }

}
