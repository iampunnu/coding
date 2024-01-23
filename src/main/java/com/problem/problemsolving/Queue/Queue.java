package com.problem.problemsolving.Queue;

public class Queue<I extends Number> {
    public Qnode front;
    public Qnode rear;
    int size;
    public Queue() { this.front = this.rear = null;
    this.size=0;}
    public void enqueue(int data){
        size=size+1;
        Qnode qnode=new Qnode(data);
        if (rear==null){
            this.front=qnode;
            this.rear=qnode;
            return;
        }
        rear.next=qnode;
        rear=qnode;
    }
    public void dequeue(){
        size=size-1;
        if (front==null){
            return;
        }
        front=front.next;
    }

}
