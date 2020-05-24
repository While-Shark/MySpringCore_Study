package com.base.spring.section_1_9_2.autowiredannotation.mydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class SimpleDemo {

    @Autowired
    private ApplicationContext context;

    public SimpleDemo() {
    }

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }
}
