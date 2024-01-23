package com.problem.problemsolving.Array.matrix;

import java.util.Scanner;

public class PrintClumnWise {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Matrix matrix=new Matrix();
        System.out.println("enter no of row");
        int r= sc.nextInt();
        System.out.println("enter no of column");
        int c=sc.nextInt();
        int arr[][]= matrix.createMatrix(r,c);
        for (int j=0;j<c;j++){
            int s=0;
            for (int i=0;i<r;i++){
                s=s+arr[i][j];
               // System.out.print(arr[i][j]+", ");
            }
            System.out.println(s);
            System.out.println();

        }

    }
}
