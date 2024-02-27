package com.problem.problemsolving.autoconfiguration;

import org.spring.autoconfigration.course.AuthorName;
import org.spring.autoconfigration.course.SpringCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelperClass {
    @Autowired
    SpringCourse springCourse;
    @Autowired
    AuthorName authorName;

    public void pring(){
        System.out.println(" "+authorName.toString()+" "+springCourse.toString());
    }
}
