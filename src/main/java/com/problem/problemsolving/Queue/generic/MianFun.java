package com.problem.problemsolving.Queue.generic;

import java.util.*;

public class MianFun {
    public static void main(String[] args) throws Exception {
        String[] s ={"(1,2)","(2,4)","(5,7)","(7,2)","(9,5)"};
      HashMap<String,String> hashMap=new HashMap<>();
        List<String> c=new ArrayList<>();
        List<String> p=new ArrayList<>();
      for (int i=0;i<s.length;i++){
          String s1=s[i];
          System.out.print(s1);
    String[] s2= s1.split("\\(|\\)|\\,| ");
    hashMap.put(s2[1],s2[2]);
    Map<String,Integer> integerMap=new HashMap<>();
    for (Map.Entry<String,String> stringStringEntry:hashMap.entrySet()){
        if(integerMap.containsKey(stringStringEntry.getValue())){
            integerMap.put(stringStringEntry.getValue(),integerMap.get(stringStringEntry.getValue())+1);
        }
        else {
            integerMap.put(stringStringEntry.getValue(),1);
        }
    }


      }
        System.out.println(hashMap.toString());




    }




}
