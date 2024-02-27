package com.problem.problemsolving.Tree.binaryTree.practice;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncester {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.CreateTreeHelper();
        Node node=lca(5,7,tree.root);
        System.out.println(node.data);
    }
    public static Node lca(int n1,int n2,Node root){

        if (root==null){
            return null;
        }
        if(root.data==n1|| root.data==n2){
          return root;
        }
        Node lcsl=lca(n1,n2,root.left);
        Node lcsr=lca(n1,n2,root.right);
        if (lcsl!=null && lcsr!=null){
            return root;
        }
        if(lcsl!=null){
            return lcsl;
        }else {return lcsr;
        }
    }
}
