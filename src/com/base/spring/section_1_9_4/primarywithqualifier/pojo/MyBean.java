package com.base.spring.section_1_9_4.primarywithqualifier.pojo;

public class MyBean {

    private String name;

    public MyBean() {
    }

    public MyBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name=" + name +
                '}';
    }
}
