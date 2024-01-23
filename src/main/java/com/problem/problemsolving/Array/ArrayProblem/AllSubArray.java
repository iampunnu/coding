package com.problem.problemsolving.Array.ArrayProblem;

public class AllSubArray {
    public static void main(String[] args) {
         int arr[]={10,12,34,2,14,90,32,18};
         for(int i=0;i<arr.length;i++){
             for (int j=i;j<arr.length;j++){
                 for(int k=i;k<=j;k++){
                     System.out.print(arr[k]+" ");
                 }
                 System.out.println();
             }
         }
    }
}
