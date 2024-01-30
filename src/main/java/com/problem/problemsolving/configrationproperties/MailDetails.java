package com.problem.problemsolving.configrationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ConfigurationProperties(prefix = "mail")
public class MailDetails {
    private String hostName;
    private int port;
    private String from;

    @Override
    public String toString() {
        return "MailDetails{" +
                "hostName='" + hostName + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' +
                ", defaultRecipients=" + defaultRecipients +
                '}';
    }

    public List<String> getDefaultRecipients() {
        return defaultRecipients;
    }

    public void setDefaultRecipients(List<String> defaultRecipients) {
        this.defaultRecipients = defaultRecipients;
    }

    private List<String> defaultRecipients;



    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

}
