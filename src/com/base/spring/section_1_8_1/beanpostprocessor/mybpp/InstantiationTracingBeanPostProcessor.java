package com.base.spring.section_1_8_1.beanpostprocessor.mybpp;

import com.base.spring.section_1_8_1.beanpostprocessor.pojo.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //在容器refresh方法中invokeBeanFactoryPostProcessors()里某个时机输出
        System.out.println("gogo go before");
        //把Student类覆盖成Person类
       if(beanName.equals("student")){
            Person person = new Person();
            person.setId("2");
            person.setName("a");
            return person;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("gogo go after");
        //在容器refresh方法中某个时机输出
        System.out.println("bean's name is: " + beanName);
        System.out.println(bean);
        return bean;
    }
}
