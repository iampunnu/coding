package com.problem.problemsolving.numberSystem;

import java.util.HashMap;

public class example {
    public static void main(StringT[] args) {

        String[] s ={"(1,2)", "(3,2)", "(2,12)", "(5,2)"};

        HashMap<String, String> hashMap=new HashMap<>();

        for (int i=0;i<s.length;i++){
            String t=s[i];
            String[] arrOfStr = t.split(",");
            System.out.println(arrOfStr);



        }
    }
}
