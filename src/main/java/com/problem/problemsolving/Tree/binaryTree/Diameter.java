package com.problem.problemsolving.Tree.binaryTree;

public class Diameter {
    public static void main(String args[]){
        CreteTree creteTree=new CreteTree();
        Node root=creteTree.createNode();
        int d=height(root);
        System.out.println(d);

    }
    public static int diameter(Node root){
        if(root==null){return 0;}
        int lh=height(root.left);
        int rh=height(root.right);
        int cur=lh+rh+1;
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        return Math.max(cur,Math.max(ld,rd));
    }
    public static int height(Node root){
        if (root==null)return 0;

        return 1+Math.max(height(root.right),height(root.left));

    }
}
