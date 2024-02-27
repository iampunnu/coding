package com.problem.problemsolving.String;


public class Removerepeatingchar {
    public static void main(String[] args) {
        String s="aabbccfddllasdfgghkkkl";
        int i=0;
        int j=0;

        String ans="";
        int l=2;
        int count=0;
        while (j<s.length()){
            if (s.charAt(i)==s.charAt(j)){
                j++;
                count++;
                if (count==l){
                    System.out.println(j-1+" "+s.charAt(j-1));
                    count=1;
                }
            }
            else if (s.charAt(i)!=s.charAt(j) ){
                ans=ans+s.charAt(i);
                i=j;
                j++;
            }
        }


        System.out.println(ans);
    }
}
