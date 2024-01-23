package com.problem.problemsolving;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(10);
        s.push(11);
        s.push(9);
        s.push(8);
        s.push(14);
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        s1.push(s.pop());
        while (!s.isEmpty()){
            if(s1.peek()<s.peek()){
                s1.push(s.pop());
            }
            else {
                if (!s1.isEmpty()&&!s.isEmpty()){
                while (s.peek()<s1.peek()){
                    s2.push(s1.pop());
                }
                }
                s1.push(s.pop());
                while (!s2.isEmpty()){
                    s1.push(s2.pop());
                }
            }
        }
        while (!s1.isEmpty()){
            System.out.println(s1.pop());
        }


    }
}
