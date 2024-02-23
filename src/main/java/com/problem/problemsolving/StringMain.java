package com.problem.problemsolving;

public class StringMain {
    public static void main(String[] args) {
        String s="abscdefdghk";
        StringBuilder sb = new StringBuilder(s);

        int k=4;
        for (int i=0;i<s.length();i=(i+k+k)){
            int m=i;
            int n=s.length()-1;
            if(i+k-1<s.length()-1){
            n=m+k-1;}
            while(m<=n){
                char c=sb.charAt(m);
                sb.setCharAt(m,sb.charAt(n));
                sb.setCharAt(n,c);
                m++;n--;
            }
        }
        System.out.println(sb.toString());
    }
}
