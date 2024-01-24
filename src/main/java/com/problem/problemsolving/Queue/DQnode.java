package com.problem.problemsolving.Queue;

public class DQnode {
    public int data;
    public DQnode next;
    public DQnode prev;
    public DQnode(int data){
        this.data=data;
        this.prev= null;
        this.next=null;
    }
}
