package com.base.spring.section_1_9_7.resource.mydemo;

import com.base.spring.section_1_9_7.resource.pojo.MovieFinder;

import javax.annotation.Resource;

public class SimpleMovieLister {

    private MovieFinder movieFinder;

    //xml配置文件里有一个name=myMovieFinder的bean
    @Resource(name="myMovieFinder")
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
}
