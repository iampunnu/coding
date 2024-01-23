package com.problem.problemsolving.Tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String args[]) {
        CreteTree creteTree = new CreteTree();
        Node root = creteTree.createNode();
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            levelOrderNaive(root, i);
            //  System.out.println();
        }
        System.out.println();
        levequeue(root);
        System.out.println();

        levequeue1(root);
    }

    public static void levelOrderNaive(Node root, int leve) {
        if (root == null) {
            return;
        }
        if (leve == 1) {
            System.out.print(root.value + " ");
        }
        if (leve > 1) {
            levelOrderNaive(root.left, leve - 1);
            levelOrderNaive(root.right, leve - 1);
        }
    }

    //using queue
    public static void levequeue(Node root) {
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        // nodes.add(null);
        while (!nodes.isEmpty()) {
            Node temp = nodes.poll();
            System.out.print(temp.value + " ");
            if (temp.left != null) {
                nodes.add(temp.left);
            }
            if (temp.right != null) {
                nodes.add(temp.right);

            }
        }
    }

    public static void levequeue1(Node root) {
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        nodes.add(null);
        while (!nodes.isEmpty()) {
            Node temp = nodes.poll();
            if (temp == null) {
                if (nodes.isEmpty()) {
                    return;
                }
                nodes.add(null);
                System.out.println();
            }
            if (temp != null) {
                System.out.print(temp.value + " ");
                if (temp.left != null) {
                    nodes.add(temp.left);
                }
                if (temp.right != null) {
                    nodes.add(temp.right);

                }
            }

        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

}
