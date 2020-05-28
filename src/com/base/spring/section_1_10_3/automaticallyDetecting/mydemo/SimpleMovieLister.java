package com.base.spring.section_1_10_3.automaticallyDetecting.mydemo;

import org.springframework.stereotype.Service;

@Service
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
}
