package com.problem.problemsolving.Tree.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LefitView {
    public static void main(String args[]) {
        CreteTree creteTree = new CreteTree();
        Node root = creteTree.createNode();
        leftview(root);
        System.out.println("  ");
        leftView1(root);
    }



    public static void leftview(Node root) {
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        nodes.add(null);
        boolean ok=true;
        while (!nodes.isEmpty()) {
            Node temp = nodes.poll();
            if (temp == null) {
                if (nodes.isEmpty()) {
                    return;
                }
                ok=true;
                nodes.add(null);
               // System.out.println();
            }
            if (temp != null) {
                if (ok==true){
                System.out.print(temp.value + " ");}
                ok=false;
                if (temp.left != null) {
                    nodes.add(temp.left);
                }
                if (temp.right != null) {
                    nodes.add(temp.right);

                }
            }

        }
    }

    static void leftView1(Node root){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i< 7; i++) {
            arrayList.add(null);
            // arrayList.add(0);
        }

        leftViewUtil(root,arrayList,0);
        for (Integer node1:arrayList){
            System.out.print(node1+" ");
        }
    }
    static void leftViewUtil(Node root,ArrayList<Integer> node1s,int level){
        if(root==null)return;;
        if(node1s.get(level)==null){
            node1s.set(level,root.value);
        }
        leftViewUtil(root.left,node1s,level+1);
        leftViewUtil(root.right,node1s,level+1);

    }

}
