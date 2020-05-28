package com.base.spring.section_1_4_3.usedependson2.example;

public class ExampleBean {

    private ManagerBean managerBean;

    public ExampleBean(){
        System.out.println("this ExampleBean");
    }

    public void setManagerBean(ManagerBean managerBean) {
        this.managerBean = managerBean;
    }
}
