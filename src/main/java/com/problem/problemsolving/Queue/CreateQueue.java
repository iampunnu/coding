package com.problem.problemsolving.Queue;

public class CreateQueue {
    public static void main(String[] args) {
        Queue<Number> queue=new Queue<Number>();
        queue.enqueue(10);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(15);
        queue.dequeue();
       queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(56);
        queue.enqueue(56);
        queue.enqueue(56);
        queue.dequeue();
        System.out.println(queue.front.data);
        System.out.println(queue.rear.data);
        System.out.println(queue.size);
    }
}
