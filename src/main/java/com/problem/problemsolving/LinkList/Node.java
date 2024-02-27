package com.problem.problemsolving.LinkList;

public class Node <T> {
    public T data;
    public Node next;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public Node(T data){
        this.data=data;
        next=null;
    }
}
