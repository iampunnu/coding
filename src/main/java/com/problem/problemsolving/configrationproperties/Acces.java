package com.problem.problemsolving.configrationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@EnableConfigurationProperties(MailDetails.class)
// do not need to add EnableConfigurationProperties if ConfigurationProperties contain @Componenet annotation
public class Acces {
    @Autowired
    MailDetails  mailDetails;
    public void pr(){
        System.out.println(mailDetails.toString());
    }
}
