package com.problem.problemsolving;

import org.beginsecure.domain.primitive.Address;
import org.beginsecure.domain.primitive.Student;
import org.spring.autoconfigration.course.SpringCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class ProblemSolvingApplication  implements CommandLineRunner{
    @Autowired
    SpringCourse s;
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext=SpringApplication.run(ProblemSolvingApplication.class, args);

       // Address a= configurableApplicationContext.getBean(Address.class);
      // a.setCity("lko");
       // System.out.println(a.getCity());
        //Autowiretest s= configurableApplicationContext.getBean(Autowiretest.class);
       // s.printdata();

    }

    @Override
    public void run(String... args) throws Exception {
        s.setName("praveen");
        s.getAuthorName().setAuthName("author");
        s.getAuthorName().setAg(12);
        System.out.println(s.getName()+" "+s.getAuthorName().getAg()+" "+s.getAuthorName().getAuthName());

    }
}
