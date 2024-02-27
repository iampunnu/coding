package com.problem.problemsolving.numberSystem;

public class StringT {
    public int solve(String A) {
        String B="";
        for(int i=A.length()-1;i>=0;i--){
            B=B+A.charAt(i);
        }
        int dp[][] =new int[A.length()+1][B.length()+1];

        int ans =lcs(A.length(),B.length(),A,B,dp);
        return ans;

    }

    public int lcs(int l,int m,String s,String t,int dp[][]){

        int ans =Integer.MIN_VALUE;


        for(int i=0;i<=l;i++){
            for(int j=0;j<=m;j++){


                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(ans,dp[i][j]);

                }
                else{
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                    ans=Math.max(ans,dp[i][i]);

                }

            }

        }
        return ans;
    }
}