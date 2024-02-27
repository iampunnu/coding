package com.problem.problemsolving.Tree.binaryTree.practice;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {

    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.CreateTreeHelper();
        levelOrder(tree.root);

    }
    public static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            Node node=queue.poll();
            if (node!=null){
                System.out.print(node.data+ " ");
                if(node.left!=null){
                queue.add(node.left);}
                if (node.right!=null){
                queue.add(node.right);
                }
            }
            else {
                System.out.println();
                if (queue.isEmpty()){
                    break;
                }
                else queue.add(null);
            }
        }



    }

}
