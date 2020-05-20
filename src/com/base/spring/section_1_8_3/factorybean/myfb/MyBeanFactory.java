package com.base.spring.section_1_8_3.factorybean.myfb;

import com.base.spring.section_1_8_3.factorybean.pojo.MyBean;
import org.springframework.beans.factory.FactoryBean;

/**
 * 实现FactoryBean接口，自定义创建一个bean。有些实例不能通过xml配置的方式注入到ioc容器里，
 * 可以采用实现FactoryBean接口的方式，将bean注入到ioc容器里。
 */
public class MyBeanFactory implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        System.out.println("getObject");
        return new MyBean();
    }

    @Override
    public Class<?> getObjectType() {
        System.out.println("getObjectType");
        return MyBean.class;
    }
}
