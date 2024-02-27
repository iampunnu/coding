package com.problem.problemsolving.Tree.binaryTree.practice;

public class HeightOftree {
    public static void main(String[] args) {

        Tree tree=new Tree();
        tree.CreateTreeHelper();

        int h=height(tree.root);
        System.out.println(h);

    }
    public static int height(Node root){
        if (root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);

    }
}
