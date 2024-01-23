package com.problem.problemsolving.Array.matrix;

import java.util.Scanner;

public class LRandRLprint {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        A a=new B();
        a.ab();

        Matrix matrix=new Matrix();
        System.out.println("enter no of row");
        int r= sc.nextInt();
        System.out.println("enter no of column");
        int c=sc.nextInt();
        int arr[][]= matrix.createMatrix(r,c);
        for (int i=0;i<r;i++){
                System.out.print(arr[i][i]+", ");

        }

        for (int i=r-1;i>=0;i--){
            System.out.print(arr[r-1-i][i]+", ");

        }

    }
}
