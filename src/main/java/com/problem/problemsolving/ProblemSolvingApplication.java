package com.problem.problemsolving;

import com.problem.problemsolving.configrationproperties.Acces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class ProblemSolvingApplication {
      @Autowired
    Acces acces;


    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext=SpringApplication.run(ProblemSolvingApplication.class, args);

       // Address a= configurableApplicationContext.getBean(Address.class);
      // a.setCity("lko");
       // System.out.println(a.getCity());
        //Autowiretest s= configurableApplicationContext.getBean(Autowiretest.class);
       // s.printdata();

    }


}
