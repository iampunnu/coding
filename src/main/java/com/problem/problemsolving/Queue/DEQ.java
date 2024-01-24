package com.problem.problemsolving.Queue;

public class DEQ {
    public DQnode front;
    public DQnode rear;
    int size;
    public DEQ() { this.front = this.rear = null;
        this.size=0;}
    public void enqueueFront(int data){
        size=size+1;
        DQnode qnode=new DQnode(data);
        if (front==null){
            this.front=qnode;
            this.rear=qnode;
            return;
        }
        qnode.next=front;
        front=qnode;
    }
    public void enqueueBack(int data){
        size=size+1;
        DQnode qnode=new DQnode(data);
        if (front==null){
            this.front=qnode;
            this.rear=qnode;
            return;
        }
        rear.next=qnode;
        qnode.prev=rear;
        rear=qnode;
    }
    public void dequeueFront(){
        size=size-1;
        if (front==null){
            return;
        }
        front=front.next;
    }
    public void dequeueBack(){
        size=size-1;
        if (front==null){
            return;
        }
        rear=rear.prev;
    }
}
