package com.base.spring.section_1_8_1.beampostprocessor;

import com.base.spring.test.pojo.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class MyBeanFactoryPP implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) beanFactory;
        //Person person = (Person) defaultListableBeanFactory.getBean("person");
        BeanDefinition person = defaultListableBeanFactory.getBeanDefinition("person");
        defaultListableBeanFactory.registerBeanDefinition("person1",person);
    }
}
