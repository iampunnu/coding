package com.problem.problemsolving.LinkList;

import java.util.HashSet;
import java.util.Iterator;

public class LinkList<T>  {
    public Node head;

    public void add(T data){
        Node node=new Node<>(data);
        if (head==null){
            head=node;
           return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }
    public void deleteAtIndex(int index){
        if(index==0){
            head=head.next;
        }
        else {
            Node cur=head;
            Node prev=null;
            int counter=0;

            while (cur!=null){
                if (counter==index){
                    prev.next=cur.next;
                    break;
                }
                prev=cur;
                cur=cur.next;
                counter++;
            }
        }

    }

    public void insertAt(int index,int data){
        Node node=new Node<>(data);
        if(index==0){
              node.next=head;
              head=node;
        }
        else {
            Node cur=head;
            Node prev=null;
            int counter=0;

            while (cur!=null){
                if (counter==index){
                    node.next=prev.next;
                    prev.next=node;
                    break;
                }
                prev=cur;
                cur=cur.next;
                counter++;
            }
            if (cur==null && index==counter){
                node.next=prev.next;
                prev.next=node;
            }
        }

    }
    public boolean hasCycle() {
        HashSet<Node> s = new HashSet<Node>();
        Node cur=head;
        while(cur!=null){
            if(s.contains(cur)){
                return true;
            }
            s.add(cur);

            cur=cur.next;
        }
        return false;

    }

    @Override
    public String toString() {
        return "LinkList{" +
                "head=" + head +
                '}';
    }
}
