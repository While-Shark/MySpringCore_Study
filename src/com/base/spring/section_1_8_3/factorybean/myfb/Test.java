package com.base.spring.section_1_8_3.factorybean.myfb;


import com.base.spring.section_1_8_3.factorybean.pojo.MyBean;
import com.base.spring.section_1_8_3.factorybean.pojo.Student;
import org.springframework.beans.factory.FactoryBean;
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

        //通过FactoryBean创建一个自定义的bean
        MyBean bean2 = (MyBean) ac.getBean("myBeanFactory");
        System.out.println(bean2.toString());
        //加个&，获得创建这个bean的工厂实例
        Object bean = ac.getBean("&myBeanFactory");
        System.out.println(bean);
    }

}
