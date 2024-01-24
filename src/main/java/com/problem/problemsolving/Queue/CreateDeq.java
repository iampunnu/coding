package com.problem.problemsolving.Queue;

public class CreateDeq {
    public static void main(String[] args) {
        DEQ deq=new DEQ();
        deq.enqueueFront(10);
        deq.enqueueFront(20);
        deq.enqueueBack(67);
        deq.enqueueFront(89);
        System.out.println(deq.front.data+" "+deq.rear.data);
        deq.dequeueFront();
        System.out.println(deq.front.data+" "+deq.rear.data);
        deq.dequeueBack();
        System.out.println(deq.front.data+" "+deq.rear.data);


    }
}
