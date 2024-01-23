package com.problem.problemsolving.BinarySearch;

public class PivotIndex {
    public static void main(String[] args) {
        int arr[]={13,14,15,7,8,9,10,11,12};
        int l=0;int h=arr.length-1;
        System.out.println(pivot(arr,l,h));
    }
    public static int pivot(int arr[],int l,int h){
        while (l<=h){
            int m=(l+h)/2;
            if(m>0 && arr[m]<arr[m-1]){
                return m;
            }
            if(m<h && arr[m]>arr[m+1]){
                return m+1;
            }
            if (arr[m]>arr[l]){
                l=m+1;
            }
            else {
                h=m-1;
            }

        }
        return -1;
    }
}
