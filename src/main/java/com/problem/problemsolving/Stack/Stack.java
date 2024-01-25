package com.problem.problemsolving.Stack;

public class Stack {
    public int size;
    public StackNode top;
    public Stack(){
        this.size=0;
        this.top=null;
    }

    public void push(int data){

        StackNode stackNode=new StackNode(data);
        if(top==null){
            size=size+1;
            top=stackNode;
        }
        else {
            size=size+1;
           // StackNode temp=top;
            stackNode.next=top;
            top=stackNode;
        }
    }
    public int pop(){
        if(top==null){
            return Integer.MIN_VALUE;}
        else {
            size=size-1;
            int n=top.data;
            top=top.next;
            return n;
        }
    }
    public int top(){
        if (top==null){
            return Integer.MIN_VALUE;
        }
        else {
            return top.data;
        }
    }
}
