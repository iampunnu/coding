package com.problem.problemsolving.String;

import java.util.LinkedList;
import java.util.List;

public class SubStringWithoutOverLap {
    public static void main(String[] args) {
        String s="aeabcdae";
        List<String> l=new LinkedList<>();
        for (int i=0;i<s.length();i++ ){
            for (int j=i;j<s.length();j++){
                String t=s.substring(i,j+1);
                if(t.length()>=1){
                    l.add(t);
                }
            }
        }
        System.out.println(l.toString());
    }
}
