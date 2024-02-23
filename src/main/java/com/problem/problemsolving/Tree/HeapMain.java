package com.problem.problemsolving.Tree;

import com.problem.problemsolving.Heap;

import java.util.List;

public class HeapMain {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap=new Heap<>();
        heap.insert(10);
        heap.insert(70);
        heap.insert(5);
        heap.insert(90);
        heap.insert(40);

        List<Integer> list=heap.list;
        for (Integer i:list){
            System.out.print(i+" ");

        }
        System.out.println();

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());

    }

}
