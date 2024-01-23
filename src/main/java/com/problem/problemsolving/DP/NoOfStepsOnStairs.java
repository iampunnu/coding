package com.problem.problemsolving.DP;

public class NoOfStepsOnStairs {
    public static void main(String[] args) {
        int n=4;
        int dp[]=new int[n+1];
        for (int i=0;i<=n;i++){
            dp[i]=-1;
        }
        System.out.println(noofwaysrecursive(n,dp));
        System.out.println(noofwaysiterative(5));
    }
    public static int noofwaysrecursive(int n,int dp[]){
        if (n<=1){
            return dp[n]=1;
        }
        if (dp[n]==-1){
            System.out.println(n+" "+dp.toString());

            dp[n]=noofwaysrecursive(n-1,dp)+noofwaysrecursive(n-2,dp);
        }
        return dp[n];

    }

    public static int noofwaysiterative(int n){
        int dp[]=new int[n+1];
         dp[0]=1;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
