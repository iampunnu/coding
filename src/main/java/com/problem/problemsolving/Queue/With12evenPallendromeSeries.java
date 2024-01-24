package com.problem.problemsolving.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class With12evenPallendromeSeries {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("11");
        queue.add("22");
        String s1="11";
        System.out.println(s1.length());
       System.out.println(s1.substring(0, s1.length()/2));
        System.out.println(s1.substring((s1.length()/2)));
        int count=0;
        int K=8;
        while (true){
            String s=queue.peek();
         //   System.out.println(s);
            queue.remove();
            count++;
            queue.add(s.substring(0,s.length()/2)+"11"+s.substring((s.length())/2));
            queue.add(s.substring(0,s.length()/2)+"22"+s.substring((s.length())/2));
            if (count==K){
                System.out.println(s);
                break;
            }
        }
   }
}
