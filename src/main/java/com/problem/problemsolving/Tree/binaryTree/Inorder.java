package com.problem.problemsolving.Tree.binaryTree;

public class Inorder {
    public static void main(String args[]){
        CreteTree creteTree=new CreteTree();
        Node root = creteTree.createNode();
        System.out.println(root.toString());
        inOrder(root);
        }

        public static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
            System.out.print(root.value+" ");
        inOrder(root.right);

        }

    }

