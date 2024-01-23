package com.problem.problemsolving.Tree.binaryTree;

public class MaxInBinaryTree {
    public static void main(String args[]){
        CreteTree creteTree=new CreteTree();
        Node root = creteTree.createNode();
        System.out.println(root.toString());
        int max=max(root);
        System.out.println(max);
    }

    public static int max(Node root){
        if (root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.value,Math.max(max(root.left),max(root.right)));
    }
}
