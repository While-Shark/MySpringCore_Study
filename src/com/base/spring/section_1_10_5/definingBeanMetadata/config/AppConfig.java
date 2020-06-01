package com.base.spring.section_1_10_5.definingBeanMetadata.config;

import com.base.spring.section_1_10_4.usefilter.demoStub.myDao.CustomerPreferenceDao;
import com.base.spring.section_1_10_4.usefilter.demoService.myService.SimpleMovieLister;
import com.base.spring.section_1_10_4.usefilter.pojo.JpaMovieFinder;
import com.base.spring.section_1_10_5.definingBeanMetadata.pojo.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_10_5/definingBeanMetadata/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");

        String[] beanNamesForType = ac.getBeanNamesForType(TestBean.class);
        for (String str:beanNamesForType){
            System.out.println(str);
        }


        //取不到
        /*TestBean bean = (TestBean) ac.getBean("public1");
        System.out.println(bean);*/

        //可以从容器内取到
        TestBean bean2 = (TestBean) ac.getBean("publicInstance1");
        System.out.println(bean2);
    }

}
