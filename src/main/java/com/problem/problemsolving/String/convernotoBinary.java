package com.problem.problemsolving.String;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class convernotoBinary {

    public static void main(String[] args) {
        List<Integer> l=new LinkedList<>();
        int n =50;
        while (n>0){
            l.add(n%2);
            n=n/2;
        }

        Collections.reverse(l);
        System.out.println(l.toString());
        for (int i=0;i<l.size();i++){
            if(l.get(i)==0){
                l.set(i,1);
            }
            else {
                l.set(i,0);
            }
        }
        System.out.println(l.toString());
        double ans =0;
          for(int i=0;i<l.size();i++){
              ans=ans+(l.get(i)*Math.pow(2,l.size()-i-1));
          }

        System.out.println((int)ans);


    }
}
