package com.problem.problemsolving.DP;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequence {
   // static List<String> al = new ArrayList<>();

    public static void main(String[] args) {
        String s="abcd";
        List<String> al = new ArrayList<>();
        System.out.println(substing(s,"",al).toString());

    }
    public static List<String>  substing(String s,String ans,List<String> al){
        if (s.length()==0){
            al.add(ans);
            return al;
        }
        substing(s.substring(1),ans+s.charAt(0), al);
       substing(s.substring(1),ans,al);
       return al;
    }
}