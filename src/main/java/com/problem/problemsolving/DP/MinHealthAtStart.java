package com.problem.problemsolving.DP;

public class MinHealthAtStart {
    public static void main(String[] args) {
        int health[][]={{-2,-3,3},{-5,-10,1},{10,30,-5}};
        minHealth(health,3,3);

    }

    public static void minHealth(int h[][],int r,int c){
        int dp[][]=new int[r][c];
        dp[r-1][c-1]=Math.max((1-h[r-1][c-1]),1);
        for(int j=c-2;j>=0;j--){
            dp[r-1][j]=Math.max((dp[r-1][j+1]-h[r-1][j]),1);
        }
        for(int i=r-2;i>=0;i--){
            dp[i][c-1]=Math.max((dp[i+1][c-1]-h[i][c-1]),1);
        }
        for(int i=r-2;i>=0;i--){
            for (int j=c-2;j>=0;j--){
                dp[i][j]=Math.max(Math.min(dp[i+1][j],dp[i][j+1])-h[i][j],1);
            }
        }
        System.out.println(dp[0][0]);

    }

}
