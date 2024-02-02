package com.problem.problemsolving.Array.ArrayProblem;

public class MaxSuarraySum {
    public static void main(String[] args) {
        int arr[]={ -2, -3, 4, -1, -2, 1, 5, -3 };
        int localMax[]=new int[8];
        localMax[0]=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            localMax[i]=Math.max(arr[i],arr[i]+localMax[i-1]);
            if(ans<=localMax[i]){
                ans=localMax[i];
            }
        }
        for (int i=0;i<localMax.length;i++){
            System.out.print(localMax[i]+" ");
        }
        System.out.println();

        int local_max=0;
        int global_max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            local_max=Integer.max(arr[i],local_max+arr[i]);
            if (local_max>global_max){
                global_max=local_max;
            }
        }
        System.out.println(global_max);
        System.out.println(ans);

    }
}
