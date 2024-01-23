package com.problem.problemsolving.BinarySearch;

public class Ceil {

    public static void main(String args[]){

        int arr []={1,4,7,9,13,18};
        int l=0;
        int h=arr.length-1;
        int t=19;
      //  int ans =ceilvalue(arr,l,h,t);
      //  System.out.println(ans);
        int ans1 =ceilvalue1(arr,l,h,t);
        System.out.println(ans1);


    }
    public static int ceilvalue(int arr[],int l, int h,int t){

        int m=(l+h)/2;
        if(arr[m]==t){
            return arr[m];
        }
        if (m<h && t>arr[m] && t<=arr[m+1] ){
            return arr[m+1];
        }
        if (arr[m]<t){
            return ceilvalue(arr,m+1,h,t);
        }
        return ceilvalue(arr,l,m-1,t);


    }

    public static int ceilvalue1(int arr[],int l, int h,int t){
        while (l<=h){
            int m=(l+h)/2;
            if (arr[m]==t){
                return arr[m];

            }
            else if(arr[m]<t){
                l=m+1;
            }
            else {
                h=m-1;
            }
        }
        return l;


    }
}
