package com.problem.problemsolving.Array.ArrayProblem;

public class MaxSubArraySumOfSizeK {
    public static void main(String[] args) {
        int arr[]={1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k=4;
        System.out.println(maxsum(arr,k));


    }
    public static int maxsum(int a[],int k){
        if(k>a.length){
            return -1;
        }
        else {
            int res=0;
            for (int i=0;i<k;i++){
                res=res+a[i];
            }
            int max=res;
            for (int i=k;i<a.length;i++){
                res=res+a[i]-a[i-k];
                max=Math.max(res,max);
            }
            return max;
        }
    }
}
