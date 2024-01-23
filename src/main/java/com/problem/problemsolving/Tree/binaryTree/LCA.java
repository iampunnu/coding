package com.problem.problemsolving.Tree.binaryTree;

public class LCA {
    public static void main(String args[]){
        CreteTree creteTree=new CreteTree();
        Node root=creteTree.createNode();
       Node res= lca(root,3,6);
        System.out.println(res.toString());

    }
    public static Node lca(Node root,int n1,int n2){
        if (root ==null){
            return null;
        }
        if(root.value==n1 || root.value==n2){
            return root;
        }
        Node left=lca(root.left,n1,n2);
        Node right=lca(root.right,n1,n2);
        if (left==null){
            return right;
        }
        if (right==null){
            return left;
        }
        return root;
    }
}
