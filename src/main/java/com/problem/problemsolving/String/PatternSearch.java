package com.problem.problemsolving.String;

public class PatternSearch {
    public static void main(String[] args) {
        String s = "abcdmnopqrsabcfmnop";
        String ans="";
        int len=Integer.MIN_VALUE;
        for (int j = 0; j < s.length(); j++) {
            for (int k = j + 1; k < s.length(); k++) {
                String p = s.substring(j, k + 1);
                String te = s.substring(k + 1);
                if (te.contains(p)){
                    if (p.length()>=len){
                        len=p.length();
                        ans=p;
                    }
                }
                //normal patternmatch
                /*for (int i = 0; i <= te.length() - p.length(); i++) {
                    if (p.equals(te.substring(i, i + p.length()))) {
                      //  System.out.println(i + " " + p);
                    }
                }*/
            }
        }
        System.out.println(ans);

        String p="mnopq";
        String t="rsabcfmnop";
        System.out.println(t.contains(p));
    }
}
