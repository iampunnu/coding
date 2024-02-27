package com.problem.problemsolving.String;

import java.util.ArrayList;
import java.util.List;

public class ClosestDistance {
    public static void main(String[] args) {
        String []strings={"the","quick","brown","fox","quick"};
        String word1="the";
        String word2="fox";
        int d=Integer.MAX_VALUE;
        for (int i=0;i<strings.length;i++){

            if(strings[i].equals(word1)){
                for (int j=i+i;j<strings.length;j++){
                    if (strings[j].equals(word2)){
                        d=Math.min(d,j-i);
                    }
                }
            }
            if(strings[i].equals(word2)){
                for (int j=i+i;j<strings.length;j++){
                    if (strings[j].equals(word1)){
                        d=Math.min(d,j-i);
                    }
                }
            }

        }
        System.out.println(d);
        System.out.println(mindis(strings,word1,word2));


    }

    public static int mindis(String []s,String w1,String w2){

        int d1=-1;int d2=-1;
        int ans=s.length;
        for (int i=0;i<s.length;i++){
            if (s[i].equals(w1)){
                d1=i;
            }
            if (s[i].equals(w2)){
                d2=i;
            }
            if (d1!=-1 && d2!=-1){
                ans=Math.min(ans,Math.abs(d1-d2));
            }
        }
        return ans;
    }
}
