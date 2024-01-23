package com.problem.problemsolving.Array;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReverseArray {
    public static void main(String[] args) {
        BigDecimal b=new BigDecimal(29306.7760);
       System.out.println( b.setScale(2, RoundingMode.FLOOR).toString());

        int ar[] = { 10,90, 50, 60, 80, 90,90,1,9,10 };
        int temp=0;
        /*for (int i=0;i<=ar.length/2;i++){
            temp=ar[ar.length-1-i];
            ar[ar.length-1-i]=ar[i];
            ar[i]=temp;

        }*/
        int k=0;int l=ar.length-1;
        while (k<l){
            temp=ar[k];
            ar[k]=ar[l];
            ar[l]=temp;
            k++;l--;

        }
        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }



    }
}
