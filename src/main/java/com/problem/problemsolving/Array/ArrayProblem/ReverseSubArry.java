package com.problem.problemsolving.Array.ArrayProblem;

public class ReverseSubArry {
    public static void main(String[] args) {
        int arr[]={12,34,56,7,89,10,35,67,89};
        int i=0;
        int j=5;
        while (i<=j){
            int a=arr[i];
            int b=arr[j];
            a=a^b;
            b=a^b;
            a=a^b;
            arr[i]=a;
            arr[j]=b;
            i++;j--;
        }
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
