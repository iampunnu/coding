package com.problem.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>>{

    public List<T> list ;
    public Heap(){
        list=new ArrayList<>();
    }
    public void swap (int first ,int second){
        T swap=list.get(first);
        list.set(first,list.get(second));
        list.set(second,swap);
    }
    public int parent(int index){
        return (index-1)/2;
    }
    public int leftChild(int index){
        return index*2+1;
    }
    public int rightChild(int index){
        return index*2+2;
    }

    public void insert(T data){
        list.add(data);
        upheap(list.size()-1);

    }
    public void upheap(int index){
        if (index==0){return;}
        int p=parent(index);
        if (list.get(index).compareTo(list.get(p))>0){
            swap(index,p);
            upheap(p);}

}

public T remove() throws Exception {
    if (list.isEmpty()) {
        throw new Exception("Removing from an empty heap!");
    }
        T data=list.get(0);
        T rmovelast=list.remove(list.size()-1);
    if (!list.isEmpty()) {
        list.set(0, rmovelast);
        downHap(0);
    }
        return data;
}

      public void downHap(int index){
        int min =index;
        int l=leftChild(index);
        int r=rightChild(index);
        if (l<list.size() && list.get(l).compareTo(list.get(min))>0){
            min=l;
        }
          if (r<list.size() && list.get(r).compareTo(list.get(min))>0){
              min=r;
          }
          if (min!=index){
              swap(min,index);
              upheap(min);
          }

      }

}
