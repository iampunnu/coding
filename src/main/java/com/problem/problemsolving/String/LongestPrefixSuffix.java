package com.problem.problemsolving.String;

public class LongestPrefixSuffix {
    public static void main(String[] args) {

        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";

        int []lps=lps(pat);
        int L=txt.length();
        int M=pat.length();
        int i=0;
        int j=0;
        while (i<L){
            if(pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if (j==M){
                System.out.println("match at "+(i-M));
            }
            else if(pat.charAt(j) != txt.charAt(i)){
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }


    }
    public static int[] lps(String pat){
        System.out.println(pat);
        int lps[] = new int[pat.length()];
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
        for (int k=0;k<lps.length;k++){
            System.out.print(lps[k]+" ");
        }
        System.out.println();

        return lps;

    }
}
