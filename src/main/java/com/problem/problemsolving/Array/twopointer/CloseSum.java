package com.problem.problemsolving.Array.twopointer;

public class CloseSum {

    public static void main(String[] args) {
        int arr[] =  {10, 22, 28, 29, 30, 40}, x = 54;
        int n = arr.length;
        printClosest(arr, n, x);
    }

    public static void printClosest(int a[],int s,int x){

        int l=0;
        int r=s-1;
        int al=-1;
        int ar=-1;
        int diff=Integer.MAX_VALUE;
        while (l<r){

            if (Math.abs(a[l]+a[r]-x)<diff){
                al=l;
                ar=r;
                diff=Math.abs(a[l]+a[r]-x);

            }
            if (a[l]+a[r]<x){l++;}
            else{r--;}


        }
        System.out.println(al+" "+ar);

    }
}
