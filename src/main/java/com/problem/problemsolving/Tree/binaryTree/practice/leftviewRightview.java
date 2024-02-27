package com.problem.problemsolving.Tree.binaryTree.practice;

import java.util.LinkedList;
import java.util.Queue;

public class leftviewRightview {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.CreateTreeHelper();
        leftView(tree.root);
        System.out.println();
        System.out.println();
        rightview(tree.root);

    }
    public static void leftView(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        boolean f=true;
        while (!queue.isEmpty()){
            Node node=queue.poll();
            if (node!=null){
                if (f){
                System.out.println(node.data);
                }
                f=false;
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            else {
                if (queue.isEmpty()){
                    break;
                }
                else {
                    f=true;
                    queue.add(null);
                }
            }

        }
    }

    public static void rightview(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        boolean f=true;
        while (!queue.isEmpty()){
            Node node=queue.poll();
            if (node!=null){
                if (f){
                    System.out.println(node.data);
                }
                f=false;
                if (node.right!=null){
                    queue.add(node.right);
                }
                if (node.left!=null){
                    queue.add(node.left);
                }
            }
            else {
                if (queue.isEmpty()){
                    break;
                }
                else {
                    f=true;
                    queue.add(null);
                }
            }

        }
    }
}
