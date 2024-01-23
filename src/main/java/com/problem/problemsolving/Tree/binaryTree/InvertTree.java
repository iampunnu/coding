package com.problem.problemsolving.Tree.binaryTree;

public class InvertTree {
    public static void main(String args[]){
        CreteTree creteTree=new CreteTree();
        Node root = creteTree.createNode();
        System.out.println(root.toString());
        Node temp=Invert(root);
        System.out.println(temp.toString());
    }

    public static Node Invert(Node root){
        if (root==null){
            return root;
        }
       Node left=Invert(root.left);
        Node right=Invert(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
}
