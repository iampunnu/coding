package com.problem.problemsolving.Array.ArrayProblem;

public class AllSubArray {
    public static void main(String[] args) {
         char arr[]={'q','w','e','r',};
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
