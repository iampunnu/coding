package com.problem.problemsolving.Stack;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {


        Stack<Integer> s1=new Stack<>();
        s1.push(2);
        s1.push(4);
        s1.push(6);
        s1.push(8);
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(7);
      // Stack<Integer> st= mergeSort1(s1);
        mergeSort(s1);
        while (!s1.isEmpty()){
            System.out.print(s1.pop()+" ");
        }

    }

    public static void mergeSort(Stack <Integer> A){

        Stack<Integer> B=new Stack<>();
        Stack<Integer> C=new Stack<>();

        while(A.size()!=0){
               if (A.size() % 2 == 0) {
                B.push(A.pop());
            }
               else {
                   C.push(A.pop());
               }
           }
        if (B.size()>1){
            mergeSort(B);
        }
        if (C.size()>1){
            mergeSort(C);
        }


         merge(B,C,A);

    }

    public static void merge(Stack<Integer> s1,Stack<Integer> s2,Stack<Integer> s){
        Stack<Integer> s3=new Stack<>();
        while (!s1.isEmpty() && !s2.isEmpty()){
            if (s1.peek()>s2.peek()){
                s3.push(s1.pop());
            }
            else {
                s3.push(s2.pop());
            }
        }
        while (!s1.isEmpty()){
            s3.push(s1.pop());
        }
        while (!s2.isEmpty()){
            s3.push(s2.pop());
        }
       while (!s3.isEmpty()){
           s.push(s3.pop());
       }
    }



    public static Stack<Integer> mergeSort1(Stack <Integer> A){
       if(A.size()<=1){return A;}
        Stack<Integer> B=new Stack<>();
        Stack<Integer> C=new Stack<>();

        while(A.size()!=0){
            if (A.size() % 2 == 0) {
                B.push(A.pop());
            }
            else {
                C.push(A.pop());
            }
        }



        return merge1(mergeSort1(B),mergeSort1(C),A);

    }

    public static Stack<Integer> merge1(Stack<Integer> s1,Stack<Integer> s2,Stack<Integer> s){
        Stack<Integer> s3=new Stack<>();
        while (!s1.isEmpty() && !s2.isEmpty()){
            if (s1.peek()>s2.peek()){
                s3.push(s1.pop());
            }
            else {
                s3.push(s2.pop());
            }
        }
        while (!s1.isEmpty()){
            s3.push(s1.pop());
        }
        while (!s2.isEmpty()){
            s3.push(s2.pop());
        }
        while (!s3.isEmpty()){
            s.push(s3.pop());
        }
        return s;
    }

}
