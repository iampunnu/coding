package com.problem.problemsolving.Queue;

import java.util.LinkedList;

public class Nowith123usingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        int K=1000;
        int count=0;
        while (true){
            int t=queue.front.data;
            queue.dequeue();
            queue.enqueue(t*10+1);
            queue.enqueue(t*10+2);queue.enqueue(t*10+3);
            count++;
            if (count==K){
                System.out.println(t+" "+count);
                break;
            }
        }

    }
}
