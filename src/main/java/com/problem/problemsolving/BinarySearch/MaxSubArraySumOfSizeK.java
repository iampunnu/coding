package com.problem.problemsolving.BinarySearch;

public class MaxSubArraySumOfSizeK {

    public  int maxsum(int a[],int k){
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
