package com.problem.problemsolving.Queue.generic;

public class CircularQueuemain {
    public static void main(String[] args) throws Exception {


    CircularQueue q = new CircularQueue(5);

    q.enQueue(14);
    q.enQueue(22);
    q.enQueue(13);
    q.enQueue(-6);

    q.displayQueue();

    int x = q.deQueue();

    // Checking for empty queue.
    if(x != -1)
    {
        System.out.print("Deleted value = ");
        System.out.println(x);
    }

    x = q.deQueue();

    // Checking for empty queue.
    if(x != -1)
    {
        System.out.print("Deleted value = ");
        System.out.println(x);
    }

    q.displayQueue();

    q.enQueue(9);
    q.enQueue(20);
    q.enQueue(5);

    q.displayQueue();

    q.enQueue(20);
}
}

