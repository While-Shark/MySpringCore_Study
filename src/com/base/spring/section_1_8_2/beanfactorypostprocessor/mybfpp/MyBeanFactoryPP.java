package com.base.spring.section_1_8_2.beanfactorypostprocessor.mybfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class MyBeanFactoryPP implements BeanFactoryPostProcessor, Ordered {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        /*DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) beanFactory;
        //Person person = (Person) defaultListableBeanFactory.getBean("person");
        BeanDefinition person = defaultListableBeanFactory.getBeanDefinition("person");
        defaultListableBeanFactory.registerBeanDefinition("person1",person);*/
        //lowest value has the highest priority
        System.out.println("order: " + getOrder());
    }

    @Override
    public int getOrder() {
        return 10;
    }
}
