package com.problem.problemsolving.LinkList;

public class MergeTwoList {
    public static void main(String[] args) {
        LinkList<Integer> list=new LinkList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(55);

        LinkList<Integer> list1=new LinkList<>();
        list1.add(3);
        list1.add(30);
        list1.add(34);
        list1.add(57);
        list1.add(100);
        Node head1 = list.head;
        Node head2=list1.head;
        System.out.println(merge(head1,head2).toString());
    }

    public static Node  merge(Node head1,Node head2){

        Node node=new Node<>(-1);
        Node cur=node;

        while (head1!=null && head2!=null){
            if ((int)head1.data<(int)head2.data){
                cur.next=head1;
                head1=head1.next;

            }
            else {
                cur.next=head2;
                head2=head2.next;
            }
            cur=cur.next;
        }
        if (head1!=null){
            cur.next=head1;

        }
        if (head2!=null){
           cur. next=head2;
        }
        return node.next;

    }


}
