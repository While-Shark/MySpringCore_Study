package com.base.spring.section_1_9_7.resource.mydemo;

import com.base.spring.section_1_9_7.resource.pojo.CustomerPreferenceDao;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

public class MovieRecommender {

    //默认根据name注入，如果没找到，根据类型注入
    @Resource
    private CustomerPreferenceDao customerPreferenceDao;

    @Resource
    private ApplicationContext context;

    public MovieRecommender() {
    }

}
