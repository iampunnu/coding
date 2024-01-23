package com.problem.problemsolving.DP;

public class diceProblem {

    public static void main(String[] args) {
        int N=7;
        System.out.println(totalCombination(N));
    }

    public static int totalCombination(int n){
        int dp[] =new int[n+1];
        dp[0]=1;
        for (int i=1;i<=n;i++){
            int s=0;
            for (int j=1;j<=6;j++){
                if(i>=j){
                s=s+dp[i-j];}
            }
            dp[i]=s;
        }
        return dp[n];

    }
}
