package com.base.spring.section_1_10_5.definingBeanMetadata.pojo;

public class TestBean {

    private String myName;
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public TestBean(String myName) {
        this.myName = myName;
    }

    public TestBean(String myName, String value) {
        this.myName = myName;
        this.value = value;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + myName + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
