package com.base.spring.section_1_9_9.usepostConstruct.mydemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CachingMovieLister {

    @PostConstruct
    public void populateMovieCache() {
        // populates the movie cache upon initialization...
        System.out.println("init");
    }

    @PreDestroy
    public void clearMovieCache() {
        // clears the movie cache upon destruction...

        System.out.println("destroy");

    }

}
