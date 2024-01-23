package com.problem.problemsolving.Array.matrix;

import java.util.Scanner;

public class PrintBoundray {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Matrix matrix=new Matrix();
        System.out.println("enter no of row");
        int r= sc.nextInt();
        System.out.println("enter no of column");
        int c=sc.nextInt();
        int arr[][]= matrix.createMatrix(r,c);
        int lr=0;
            for (int j=0;j<c-1;j++){
                System.out.print(arr[lr][j]+", ");
            }
            System.out.println();

        int td=c-1;
        for (int i=0;i<r-1;i++){
            System.out.print(arr[i][td]+", ");
        }
        System.out.println();

        int rl=r-1;
        for (int j=c-1;j>0;j--){
            System.out.print(arr[rl][j]+", ");
        }
        System.out.println();

        int dt=0;
        for (int i=r-1;i>0;i--){
            System.out.print(arr[i][dt]+", ");
        }
        System.out.println();



    }
}
