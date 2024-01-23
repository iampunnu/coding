package com.problem.problemsolving.DP;

public class LCS {
    public static void main(String[] args) {
        String s1="AGGTAB";
        String s2="GXTXAYB";
        lcs(s1,s2);
    }
    public static void lcs(String s1,String s2){
        int r=s1.length();
        int c=s2.length();
        int dp[][]=new int[r][c];
        for(int i=0;i<r;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<c;j++){

            dp[0][j]=1;
        }
        for(int i=0;i<r;i++){
            if (s1.charAt(i)!=s2.charAt(0)){
            dp[i][0]=0;}
            else {break;}
        }
        for(int j=0;j<c;j++){
            if (s1.charAt(0)!=s2.charAt(j)){
                dp[0][j]=0;}
            else {break;}
        }
        for(int i=1;i<r;i++){
            for (int j=1;j<c;j++){
                if (s1.charAt(i)==s2.charAt(j)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }

        }
        System.out.println(dp[r-1][c-1]);
    }

}
