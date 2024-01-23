package com.problem.problemsolving.Tree.binaryTree;

public class SizeOfTree {
    public static void main(String args[]){
        CreteTree creteTree=new CreteTree();
        Node root = creteTree.createNode();
        System.out.println(root.toString());
        int size=size(root);
        System.out.println(size);
    }

    public static int size(Node root){
        if (root==null){
            return 0;
        }
        return size(root.right)+size(root.left)+1;

    }
}
