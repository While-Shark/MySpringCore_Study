package com.base.spring.section_1_9_4.customqualifierannotations_demo2.pojo;

import com.base.spring.section_1_9_4.customqualifierannotations_demo2.annotation.MovieQualifier;
import com.base.spring.section_1_9_4.customqualifierannotations_demo2.service.MovieCatalog;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {

    @Autowired
    @MovieQualifier(format=Format.VHS, genre="Action")
    private MovieCatalog actionVhsCatalog;

    @Autowired
    @MovieQualifier(format=Format.VHS, genre="Comedy")
    private MovieCatalog comedyVhsCatalog;


    @Autowired
    @MovieQualifier(format=Format.DVD, genre="Action")
    private MovieCatalog actionDvdCatalog;

    @Autowired
    @MovieQualifier(format=Format.BLURAY, genre="Comedy")
    private MovieCatalog comedyBluRayCatalog;



}
