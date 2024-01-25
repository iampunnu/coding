package com.problem.problemsolving.Stack;

public class CreateStack {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(12);
        s.push(14);
        s.push(14);
        s.push(13);
        System.out.println(s.top()+" "+s.size);
        System.out.println(s.pop()+" "+s.size+" "+s.pop()+" "+s.pop());
        System.out.println(s.top()+" "+s.size);
    }
}
