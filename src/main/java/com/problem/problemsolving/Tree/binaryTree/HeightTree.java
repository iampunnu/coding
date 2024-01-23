package com.problem.problemsolving.Tree.binaryTree;

public class HeightTree {
    public static void main(String args[]){
        CreteTree creteTree=new CreteTree();
        Node root = creteTree.createNode();
        System.out.println(root.toString());
        int height=height(root);
        System.out.println(height);
    }

    public static int height(Node root){
        if (root==null){
            return 0;
        }
        return Math.max(height(root.right),height(root.left))+1;

    }

}
