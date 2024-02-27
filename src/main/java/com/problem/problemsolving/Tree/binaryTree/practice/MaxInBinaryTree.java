package com.problem.problemsolving.Tree.binaryTree.practice;

public class MaxInBinaryTree {
    public static void main(String[] args) {

        Tree tree=new Tree();
        tree.CreateTreeHelper();

        int h=max(tree.root);
        System.out.println(h);

    }
    public static int max(Node root){
        if (root==null){
            return Integer.MIN_VALUE;
        }
        int lm=max(root.left);
        int rm=max(root.right);
        return Math.max(Math.max(lm,rm),root.data);

    }
}
