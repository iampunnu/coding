package com.problem.problemsolving.DP;

public class MinNoToPerfectSquare {
    public static void main(String[] args) {
        int n=1000;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            int ans=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                if(i>=j*j) {
                    int y = dp[i - (j * j)];
                    ans=Math.min(ans,y);
                }

            }
            dp[i]=ans+1;
        }
        System.out.println(dp[n]);

    }
}
