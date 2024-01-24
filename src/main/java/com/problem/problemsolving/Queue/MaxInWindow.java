package com.problem.problemsolving.Queue;

import sun.misc.Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxInWindow {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<Integer>();
        int[] arr = { 2, 3, 7, 9, 5, 1, 6, 4, 3 };
        int k = 3;
        int start=0;
        for (int i=0;i<k;i++){
            while (dq.size()>0 && arr[i]>arr[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.getFirst()]+" ");
        start++;
        for (int i =k;i<arr.length;i++){
            while (dq.size()>0 && arr[i]>arr[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            if (start>dq.getFirst()){
                dq.removeFirst();
            }
            System.out.print(arr[dq.getFirst()]+" ");
            start++;

        }
    }
}
