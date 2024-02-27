package com.problem.problemsolving.String;

public class LongestPallendromicSubString {
    public static void main(String[] args) {
        String A="xbacdfgdcaba";
        String B="";
        for(int i=A.length()-1;i>=0;i--){
            B=B+A.charAt(i);
        }
        int dp[][] =new int[A.length()+1][B.length()+1];

        String ans =lcs(A.length(),B.length(),A,B,dp);
        System.out.println(ans);

    }

    public static String lcs(int l,int m,String s,String t,int dp[][]){

        int ans =Integer.MIN_VALUE;
        int k=0;
        int z=0;

        for(int i=0;i<=l;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(ans,dp[i][j]);
                    k=i-1;
                }
                else{
                    dp[i][j]= 0;
                    ans=Math.max(ans,dp[i][i]);
                }
            }
        }

        String re="";
        System.out.println(ans+" "+k);
        for(int p=0;p<ans;p++){
            re=re+s.charAt(k--);
        }
        String te="";
        for(int n=re.length()-1;n>=0;n--){
            te=te+re.charAt(n);
        }

        return te;
    }
}
