package com.base.spring.section_1_8_1.beampostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //在容器refresh方法中某个时机输出
        System.out.println("gogo go");

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //在容器refresh方法中某个时机输出
        System.out.println("bean's name is: " + beanName);
        System.out.println(bean);
        return bean;
    }
}
