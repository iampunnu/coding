package com.problem.problemsolving.Serilization;

import java.io.Serializable;

public class Serilizationparent implements Serializable {
   transient String name;
    String address;
    static String school="1";

    public Serilizationparent(String name, String address) {
        this.name = name;
        this.address = address;
    }
    protected    void sum(){}
}
