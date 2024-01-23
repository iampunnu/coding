package com.problem.problemsolving.BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] ={1,4,7,8,10,11};
        int l=0;
        int h=arr.length-1;
        int t=10;
        System.out.println( binarysearch(arr,l,h,t));
        t=7;
        System.out.println( binarysearch1(arr,l,h,t));


    }

    public static int binarysearch(int arr[],int l,int h,int t){
        if(l<=h){
            int m=(l+h)/2;
            if (arr[m]==t){
            return m;
            }
            if(arr[m]<t){
                return binarysearch(arr,m+1,h,t);
            }
            else {
                return binarysearch(arr,l,m-1,t);
            }
        }
        return -1;

    }

    public static int binarysearch1(int arr[],int l,int h,int t){
        while (l<=h){
            int m=(l+h)/2;
            if (arr[m]==t){
                return m;
            }
            if(arr[m]<t){
                l=m+1;
            }
            else {
                h=m-1;
            }
        }
        return -1;

    }
}
