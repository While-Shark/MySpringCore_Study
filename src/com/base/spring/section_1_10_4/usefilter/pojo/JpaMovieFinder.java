package com.base.spring.section_1_10_4.usefilter.pojo;

import com.base.spring.section_1_10_3.automaticallyDetecting.mydemo.MovieFinder;
import org.springframework.stereotype.Repository;

@Repository
public class JpaMovieFinder implements MovieFinder {
    @Override
    public void find() {
        System.out.println("find it by JpaMovieFinder");
    }
}
