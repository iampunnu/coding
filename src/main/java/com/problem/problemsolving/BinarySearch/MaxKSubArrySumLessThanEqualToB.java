package com.problem.problemsolving.BinarySearch;

public class MaxKSubArrySumLessThanEqualToB {
    public static void main(String[] args) {
        MaxSubArraySumOfSizeK maxSubArraySumOfSizeK=new MaxSubArraySumOfSizeK();
        int arr[]={1, 4, 2, 10, 2, 3, 1, 0, 20};
        int l=0;
        int h=arr.length-1;
        int b=25;
        int ans=-1;
        while (l<=h){
            int m=(l+h)/2;
            int sum=maxSubArraySumOfSizeK.maxsum(arr,m);
            System.out.println(m+" "+sum+" "+l+" "+h);
            if (sum<=b){
                ans=m;
                l=m+1;
            }
            else {h=m-1;}

        }
        System.out.println(ans);
    }
}
