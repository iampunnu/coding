package com.problem.problemsolving.DP;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int arr[]={5,5,10,100,10,5};
        int dp[]=new int[arr.length];
        dp[0]=1;
        int ans=1;
        for (int i=1;i<arr.length;i++){
            int v=0;
            for (int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    v=Math.max(v,dp[j]);
                }
                dp[i]=v+1;
                ans=Math.max(ans,dp[i]);
            }
        }
        System.out.println(ans);
    }
}
