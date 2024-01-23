package com.problem.problemsolving.Stack;

import java.util.Stack;

public class MergeTwoStack {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        Stack<Integer> s3=new Stack<>();
        s1.push(2);
        s1.push(4);
        s1.push(6);
        s1.push(8);
        s2.push(1);
        s2.push(3);
        s2.push(5);
        s2.push(7);
        while (!s1.isEmpty() && !s2.isEmpty()){
            System.out.println(s2.peek()+ " "+s1.peek());

            if (s1.peek()>s2.peek()){
                s3.push(s1.pop());
                System.out.println(s3.peek());
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
            System.out.print(s3.pop()+" ");
        }

    }
}
