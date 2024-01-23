package com.problem.problemsolving.Array.matrix;

import java.util.Scanner;

public class Matrix {
    static Scanner sc = new Scanner(System.in);;  // Create a Scanner object
    public int [][]createMatrix(int r ,int c){
        int[][] array = new int[r][c];
        for (int i=0;i<r;i++){
            System.out.println("enter row "+i);
            for (int j=0;j<c;j++){
                int in= sc.nextInt();
                array[i][j]=in;
            }
        }

return array;


    }

}
