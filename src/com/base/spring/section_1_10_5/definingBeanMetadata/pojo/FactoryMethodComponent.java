package com.base.spring.section_1_10_5.definingBeanMetadata.pojo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {


    @Bean
    @Qualifier("public1")
    public TestBean publicInstance() {
        return new TestBean("publicInstance1","1");
    }

    @Bean
    @Qualifier("public2")
    public TestBean publicInstance1() {
        return new TestBean("publicInstance2","2");
    }

    public void doWork() {
        // Component method implementation omitted
        System.out.println("do work...");
    }

}
