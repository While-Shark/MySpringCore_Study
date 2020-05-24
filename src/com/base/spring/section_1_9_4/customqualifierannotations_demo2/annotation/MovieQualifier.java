package com.base.spring.section_1_9_4.customqualifierannotations_demo2.annotation;

import com.base.spring.section_1_9_4.customqualifierannotations_demo2.pojo.Format;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface MovieQualifier {

    String genre();
    Format format();

}
