package com.problem.problemsolving.Queue.generic;

public class CircularQueue {

    int sq[];
    int front =-1;
    int rear=-1;
    public CircularQueue(int size){
        this.sq=new int[size];
    }
    public void enQueue(int data) throws Exception {
        if((front==0&& rear==sq.length-1) || (rear==(front-1)%sq.length)){
            throw new Exception("full");
        }
        else if(rear==sq.length-1 && front!=0){
            rear=0;
            sq[rear]=data;
        }
        else if(front==-1){
            rear=0;
            front=0;
            sq[rear]=data;
        }
        else {
            rear=rear+1;
            sq[rear]=data;
        }

    }
    public int deQueue()
    {
        int temp;

        // Condition for empty queue.
        if(front == -1)
        {
            System.out.print("Queue is Empty");

            // Return -1 in case of empty queue
            return -1;
        }

        temp = sq[front];

        // Condition for only one element
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }

        else if(front == sq.length - 1)
        {
            front = 0;
        }
        else
        {
            front = front + 1;
        }

        // Returns the dequeued element
        return temp;
    }

    public void displayQueue(){
        if (front==-1){
            System.out.println("empty");
            return;
        }
        if (front<=rear){
            for (int i=front;i<=rear;i++){
            System.out.print(sq[i]+" ");
            }
        }
        else {
            for (int i= front;i<sq.length;i++){
                System.out.print(sq[i]+" ");
            }
            for (int i=0;i<=rear;i++){
                System.out.print(sq[i]+" ");
            }
        }
    }

}
