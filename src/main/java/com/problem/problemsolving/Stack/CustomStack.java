package com.problem.problemsolving.Stack;

import net.bytebuddy.implementation.bytecode.Throw;

public class CustomStack {
    protected int [] data;
    public  static int Default_size=10 ;
    public int ptr=-1;

    public CustomStack(){
        this.data=new int[Default_size];
    }
    public CustomStack(int size){
        this.data=new int[size];

    }

    public void push(int data) throws StackException {
        if (isFull()){

        throw new StackException("can Not Insert stack is full");
        }
        ptr++;
        this.data[ptr]=data;
    }
    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("can Not pop stack is empty");
        }
        return this.data[ptr--];
    }

    public int peek(){
        if (isEmpty()){
            return 0;
        }
        return this.data[ptr];

        }


    public boolean isFull(){
        if (data.length-1==ptr)
            return true;
        return false;
    }
    public boolean isEmpty(){
        if (ptr==-1)
            return true;
        return false;
    }


}
