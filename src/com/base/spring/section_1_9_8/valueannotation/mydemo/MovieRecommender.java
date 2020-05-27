package com.base.spring.section_1_9_8.valueannotation.mydemo;

import com.base.spring.section_1_9_7.resourceannotation.pojo.CustomerPreferenceDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/*@Component*/
public class MovieRecommender {

    private final String catalog;

    /*public MovieRecommender(@Value("${catalog.name}") String catalog) {
        this.catalog = catalog;
    }*/

    //配置文件没配置catalog.name，则默认为defaultABC。若配置文件有配置，则注入配置文件的值
    /*public MovieRecommender(@Value("${catalog.name:defaultABC}") String catalog) {
        this.catalog = catalog;
    }*/
    public MovieRecommender(@Value("#{systemProperties['file.encoding'] + '_Catalog' }") String catalog) {
        this.catalog = catalog;
    }


    @Override
    public String toString() {
        return "MovieRecommender{" +
                "catalog='" + catalog + '\'' +
                '}';
    }
}
