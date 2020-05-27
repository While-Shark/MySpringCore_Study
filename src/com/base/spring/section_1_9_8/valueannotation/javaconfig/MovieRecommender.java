package com.base.spring.section_1_9_8.valueannotation.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {

    private final String catalog;

    public MovieRecommender(@Value("${catalog.name}") String catalog) {
        this.catalog = catalog;
    }


    @Override
    public String toString() {
        return "MovieRecommender{" +
                "catalog='" + catalog + '\'' +
                '}';
    }
}
