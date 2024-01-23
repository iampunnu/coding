package com.problem.problemsolving.DP;

public class TopToBottomWithBlockCell {
    public static void main(String[] args) {
        int health[][]={{1,1,1,1},{1,0,1,0},{0,1,1,1},{1,0,1,1},{1,1,1,1}};
        minlength(health,5,4);
    }
    public static void minlength(int h[][],int r,int c){
        int dp[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        for(int i=0;i<r;i++){
            if(h[i][0]==0){
                break;
            }
            else {
                dp[i][0]=1;
            }
        }
        for(int j=0;j<c;j++){
            if(h[0][j]==0){
                break;
            }
            else {
                dp[0][j]=1;
            }
        }

        for (int i=1;i<r;i++){
            for (int j=1;j<c;j++){
                if(h[i][j]==0){

                }
                else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        System.out.println(dp[r-1][c-1]);

    }
}
