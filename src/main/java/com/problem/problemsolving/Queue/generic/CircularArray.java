package com.problem.problemsolving.Queue.generic;

import java.util.Scanner;

public class CircularArray {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int a[]=new int[6];
        for (int i=0;i<a.length;i++){
            Integer j= scanner.nextInt();
            a[i]=j;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        circularprint(a,3);
    }
    public static void circularprint(int a[],int index){
        int n=a.length;
        for (int i=index;i<n+index;i++){
            System.out.print(a[i%n]+" ");
        }
    }
}
