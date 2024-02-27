package com.problem.problemsolving.Tree.binaryTree.practice;

public class createTree {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.CreateTreeHelper();
        inorder(tree.root);

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");

        inorder(root.right);

    }
}
