package com.problem.problemsolving.BinarySearch;

public class Floor {
    public static void main(String args[]){

        int arr []={1,4,7,9,13,18};
        int l=0;
        int h=arr.length-1;
        int t=25;
      //  int ans =floor(arr,l,h,t);
     //   System.out.println(ans);
        int ans1 =ceilvalue1(arr,l,h,t);
        System.out.println(ans1);


    }
    public static int floor(int arr[],int l, int h,int t){
        if (l>h){return -1;}
        if (t >= arr[h])
            return arr[h];
        int m=(l+h)/2;
        if(arr[m]==t){
            return arr[m];
        }
        if (m>0 && arr[m-1]<=t && arr[m]>t){
            return arr[m-1];
        }
        if (arr[m]<t){
            return floor(arr,m+1,h,t);
        }
        return floor(arr,l,m-1,t);
    }

    public static int ceilvalue1(int arr[],int l, int h,int t){
        int ans=Integer.MIN_VALUE;
        while (l<=h){
            int m=(l+h)/2;
            if (arr[m]==t){
                return arr[m];

            }
            else if(arr[m]<t){
                ans=arr[m];
                l=m+1;
            }
            else {
                h=m-1;
            }
        }
        return ans;


    }
}
