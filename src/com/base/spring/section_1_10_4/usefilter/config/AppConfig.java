package com.base.spring.section_1_10_4.usefilter.config;

import com.base.spring.section_1_10_4.usefilter.demoStub.myDao.CustomerPreferenceDao;
import com.base.spring.section_1_10_4.usefilter.demoService.myService.SimpleMovieLister;
import com.base.spring.section_1_10_4.usefilter.pojo.JpaMovieFinder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_10_4/usefilter/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");

        CustomerPreferenceDao bean = ac.getBean(CustomerPreferenceDao.class);
        System.out.println(bean);
        SimpleMovieLister bean1 = ac.getBean(SimpleMovieLister.class);
        System.out.println(bean1);
        CustomerPreferenceDao bean2 = ac.getBean(CustomerPreferenceDao.class);
        System.out.println(bean2);

        //@Repository注解在xml配置文件里排除了，这次getBean获取不到,会报错
        JpaMovieFinder bean3 = ac.getBean(JpaMovieFinder.class);
        System.out.println(bean3);
    }

}
