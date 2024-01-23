package com.problem.problemsolving.Array.ArrayProblem;

public class NearestMinMax {
    public static void main(String[] args) {
        int arr[]={ 1, 5, 9, 7, 1, 9, 4 };
        int ans=Integer.MAX_VALUE;
        int minp=-1;
        int maxp=-1;
        int min =1;
        int max=9;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==min){
                minp=i;
            }

        if(arr[i]==max){
            maxp=i;
        }
        if(maxp!=-1 && minp!=-1){
            ans=(Math.min(ans,Math.abs(maxp-minp)+1));
        }

        }
        System.out.println(ans);
    }
}
