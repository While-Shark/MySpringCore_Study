package com.base.spring.section_1_8_3.factorybean.myfb;


import com.base.spring.section_1_8_3.factorybean.pojo.MyBean;
import com.base.spring.section_1_8_3.factorybean.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_8_3/factorybean/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");
        Student per = (Student) ac.getBean("student");
        System.out.println(per.toString());

        MyBean bean = ac.getBean(MyBean.class);
        System.out.println(bean.toString());
    }

}
