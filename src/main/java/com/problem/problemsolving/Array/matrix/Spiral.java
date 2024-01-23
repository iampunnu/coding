package com.problem.problemsolving.Array.matrix;

import java.util.Scanner;

public class Spiral {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Matrix matrix=new Matrix();
        System.out.println("enter no of row");
        int r= sc.nextInt();
        System.out.println("enter no of column");
        int c=sc.nextInt();
        int arr[][]= matrix.createMatrix(r,c);
        int i=0;int j=0;
        for (int k=1;j<=c-1;k++){
            System.out.print(arr[i][j]+", ");
            j++;
        }
        System.out.println();

         i=0; j=c-1;
        for (int k=1;j<=r-1;k++){
            System.out.print(arr[i][j]+", ");
            i++;
        }
        System.out.println();
        i=r-1; j=c-1;
        for (int k=1;j<=c-1;k++){
            System.out.print(arr[i][j]+", ");
            j--;
        }
        System.out.println();
        i=r-1; j=0;
        for (int k=1;j<=r-1;k++){
            System.out.print(arr[i][j]+", ");
            i--;
        }
        System.out.println();



    }

}
