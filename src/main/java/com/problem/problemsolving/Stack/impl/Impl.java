package com.problem.problemsolving.Stack.impl;

import com.problem.problemsolving.Stack.CustomStack;

public class Impl {
    public static void main(String[] args) throws Exception {
        CustomStack stack=new CustomStack(20);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek()+" "+stack.ptr);
        System.out.println(stack.pop()+" "+stack.ptr);
        System.out.println(stack.pop()+" "+stack.ptr);
        System.out.println(stack.pop()+" "+stack.ptr);
        System.out.println(stack.pop()+" "+stack.ptr);




    }
}
