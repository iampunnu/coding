package com.problem.problemsolving.Array.matrix;

import java.util.Scanner;

public class AllRLDiagonal {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Matrix matrix=new Matrix();
        System.out.println("enter no of row");
        int r= sc.nextInt();
        System.out.println("enter no of column");
        int c=sc.nextInt();
        int arr[][]= matrix.createMatrix(r,c);
            for (int j=0;j<c;j++){
                int e=j;int s=0;

                while(s<r&&e>=0){
                System.out.print(arr[s][e]+", ");
                s++;e--;

                }
                System.out.println();

            }


        for (int j=0;j<r;j++){
            int s=j;int e=c-1;

            while(s<r&&e>=0){
                System.out.print(arr[s][e]+", ");
                s++;e--;

            }
            System.out.println();

        }



    }

}
