package com.base.spring.section_1_10_3.automaticallyDetecting.mydemo;

import org.springframework.stereotype.Repository;

@Repository
public class JpaMovieFinder implements MovieFinder {
    @Override
    public void find() {
        System.out.println("find it by JpaMovieFinder");
    }
}
