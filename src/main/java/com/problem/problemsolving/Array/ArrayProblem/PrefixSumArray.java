package com.problem.problemsolving.Array.ArrayProblem;

public class PrefixSumArray {
    public static void main(String[] args) {
        int arr[]={12,45,90,1,3,10,23};
        int psa[]=new int[7];
        psa[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            psa[i]=psa[i-1]+arr[i];
        }
        for (int i=0;i<psa.length;i++){
        System.out.print(psa[i]+" ");
        }
        int l=2;
        int r=6;
        System.out.println(psa[r]-psa[l]+arr[l]);
    }
}
