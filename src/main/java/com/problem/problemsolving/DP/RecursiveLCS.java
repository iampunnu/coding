package com.problem.problemsolving.DP;

public class RecursiveLCS {
    public static void main(String[] args) {
        String s1="AGGTAB";
        String s2="GXTXAYB";
        int[][] dp = new int[s1.length()][s2.length()];
        for (int i=0;i<s1.length();i++){
            for (int j=0;j<s2.length();j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(recursiveLcs(s1,s2,s1.length()-1,s2.length()-1,dp));

    }
    public static int recursiveLcs(String s1,String s2,int i,int j, int dp[][]){
        if(i==-1 || j==-1){
            return 0;
        }
        if (dp[i][j]==-1){
            if(s1.charAt(i)==s2.charAt(j)){
                dp[i][j]= 1+recursiveLcs(s1,s2,i-1,j-1,dp);
            }
            else {
                dp[i][j]=Math.max(recursiveLcs(s1,s2,i-1,j,dp),recursiveLcs(s1,s2,i,j-1,dp));
            }
        }
        return dp[i][j];
    }
}
