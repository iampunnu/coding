package com.problem.problemsolving.Array.twopointer;

import java.util.ArrayList;

public class HeapSort {
    public static void main(String[] args) throws Exception {
/*
        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        buildHeap(arr, arr.length);

        for (int i = arr.length - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

        ArrayList list = heap.heapSort();
        System.out.println(list);

    }

    public static void buildHeap(int a[], int n) {
        int startindex = (n / 2) - 1;
        for (int i = startindex; i >= 0; i--) {
            heapify(a, n, i);

        }

    }
    public static void heapify(int a[],int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && a[l]<a[largest] ){
            largest=l;
        }
        if (r<n && a[r]<a[largest]){
            largest=r;
        }
        if (largest!=i){
            int swap=a[i];
            a[i]=a[largest];
            a[largest]=swap;
            heapify(a,n,largest);
        }
    }
}
