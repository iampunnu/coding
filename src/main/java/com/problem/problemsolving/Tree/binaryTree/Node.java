package com.problem.problemsolving.Tree.binaryTree;

public class Node {
    public Node left;
    Node right;
    int value;
    public Node(int value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }
}
