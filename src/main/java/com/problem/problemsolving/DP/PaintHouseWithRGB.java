package com.problem.problemsolving.DP;

public class PaintHouseWithRGB {
    public static void main(String[] args) {
        int n=4;
        int R[]={1,5,3,1};
        int G[]={5,8,2,2};
        int B[]={7,4,9,4};
        int dp[][] =new int[n][3];
        dp[0][0]=R[0];
        dp[0][1]=G[0];
        dp[0][2]=B[0];
        for (int i=1;i<n;i++){
            dp[i][0]=R[i]+Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1]=G[i]+Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2]=B[i]+Math.min(dp[i-1][1],dp[i-1][0]);

        }
        System.out.println(Math.min(Math.min(dp[3][0],dp[3][1]),dp[3][2]));
    }
}
