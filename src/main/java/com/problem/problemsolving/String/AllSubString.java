package com.problem.problemsolving.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AllSubString {
    public static void main(String[] args) {
        String s="aaaaaaaaaa";
       Set<String> stringSet=new HashSet<>();
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if(checkPalendrom(s.substring(i,j+1))){
                    stringSet.add(s.substring(i,j+1));
                }
                }
            }
        System.out.println(stringSet.toString());
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (Map.Entry<String,Integer> integerEntry:hashMap.entrySet()){}

    }

        public static boolean checkPalendrom(String s){
                  int i=0;
                  int j=s.length()-1;
                  while (i<=j){
                      if (s.charAt(i)!=s.charAt(j)){
                          return false;
                      }
                      i++;j--;
                  }
                  return true;
        }
    }

