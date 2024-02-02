package com.problem.problemsolving.DP;

public class MaxSubsequenceSumConsicutiveNotIncluded {
    public static void main(String[] args) {
        int arr[]={5,5,10,100,10,5};
        int dp[]=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);

        for(int i=2;i<arr.length;i++){
            dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
        }
        System.out.println(dp[arr.length-1]);
    }
}
