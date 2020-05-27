package com.base.spring.section_1_9_8.valueannotation.mydemo;

import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

public class MovieFinder {

    private final Map<String, Integer> countOfMoviesPerCatalog;

    public MovieFinder(
            @Value("#{{'Thriller': 100, 'Comedy': 300}}") Map<String, Integer> countOfMoviesPerCatalog) {
        this.countOfMoviesPerCatalog = countOfMoviesPerCatalog;
    }

    @Override
    public String toString() {
        return "MovieFinder{" +
                "countOfMoviesPerCatalog=" + countOfMoviesPerCatalog +
                '}';
    }
}
