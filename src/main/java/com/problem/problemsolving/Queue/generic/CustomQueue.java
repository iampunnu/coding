package com.problem.problemsolving.Queue.generic;

public class CustomQueue {

    public int [] qu;
    int end =-1;

    public CustomQueue (int size){
        qu=new int[size];
    }

    public boolean enqueue(int data){
        if (isfull()){
            return false;
        }
        qu[++end]=data;
        return true;
    }
    public int dequeue() throws Exception {
        if (isEmpty()){
            throw new Exception("queue is empty");
        }
        int ans=qu[0];
        for (int i=1;i<=end;i++){
            qu[i-1]=qu[i];
        }
        end--;
        return ans;
    }

    public boolean isfull(){
        if (qu.length-1==end)
            return true;
        return false;
    }
    public boolean isEmpty(){
        if (end==-1){
            return true;
        }return false;
    }
}
