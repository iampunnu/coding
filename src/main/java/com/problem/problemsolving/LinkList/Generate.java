package com.problem.problemsolving.LinkList;

public class Generate {

    public static void main(String[] args) {
        LinkList<Integer> list=new LinkList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.insertAt(3,10);
        list.head.next.next.next=list.head.next;
        System.out.println(list.hasCycle());

    Character c='P';
      //  System.out.println(list.toString());
        System.out.println(Character.isLetter(c));
        System.out.println(Character.toLowerCase(c));

    }
}
