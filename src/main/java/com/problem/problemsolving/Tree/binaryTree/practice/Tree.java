package com.problem.problemsolving.Tree.binaryTree.practice;
import java.util.Scanner;

public class Tree {

    public Node root;
    static Scanner sc = new Scanner(System.in);;  // Create a Scanner object
    public void CreateTreeHelper(){
        this.root=createNode();
    }
    public Node createNode() {
        Node root = null;
        System.out.println("enter data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("enter for left " + data);
        root.left = createNode();
        System.out.println("enter for right " + data);
        root.right = createNode();
        return root;
    }
}
