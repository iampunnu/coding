package com.problem.problemsolving.Array.twopointer;

public class ClosestPairSumInTwosortedArray {
    public static void main(String[] args) {
        int ar2[] = {1, 4, 5, 7};
        int ar1[] = {10, 20, 30, 40};
        int m = ar1.length;
        int n = ar2.length;
        int x = 38;
        printClosest(ar1, ar2, m, n, x);

    }
    public static void printClosest(int a1[],int a2[],int m,int n,int x){

        int diff=Integer.MAX_VALUE;
        int l=0;
        int r=n-1;
        int ans1=-1;
        int ans2=-1;
        while (l<m && r>=0){
            if(Math.abs(a1[l]+a2[r]-x)<diff){
                ans1=l;
                ans2=r;
                diff=Math.abs(a1[l]+a2[r]-x);
            }
            if(a1[l]+a2[r]<x){
                l++;

            }
            else {r--;}
        }
        System.out.println(ans1+" "+ans2);
    }
}
