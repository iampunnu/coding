package com.problem.problemsolving.Array.matrix;

import java.util.Scanner;

public class Rotate90Degree {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Matrix matrix=new Matrix();
        System.out.println("enter no of row");
        int r= sc.nextInt();
        System.out.println("enter no of column");
        int c=sc.nextInt();
        int arr[][]= matrix.createMatrix(r,c);
        for (int i=0;i<r;i++){
            for (int j=i+1;j<c;j++){
                arr[i][j]=arr[i][j]^arr[j][i];
                arr[j][i]=arr[i][j]^arr[j][i];
                arr[i][j]=arr[i][j]^arr[j][i];

            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();

        }
        for (int i=0;i<r;i++){
            int start=0;int end=c-1;
           while(start<end)
            {
                arr[i][start]=arr[i][start]^arr[i][end];
                arr[i][end]=arr[i][start]^arr[i][end];
                arr[i][start]=arr[i][start]^arr[i][end];
                start++;
                end--;


        }}
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();

        }

    }
}
