package com.problem.problemsolving.DP;

public class MinCostWithoutBlockedCell {
    public static void main(String[] args) {
        minlength(3,4);
    }
    public static void minlength(int r,int c){
        int dp[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        for(int i=0;i<r;i++){

                dp[i][0]=1;

        }
        for(int j=0;j<c;j++){

                dp[0][j]=1;
        }

        for (int i=1;i<r;i++){
            for (int j=1;j<c;j++){

                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        System.out.println(dp[r-1][c-1]);

    }
}
