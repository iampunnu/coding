package com.problem.problemsolving.Tree.binaryTree;

import java.util.*;

public class TopView {
    public static void main(String args[]) {
        CreteTree creteTree = new CreteTree();
        Node root = creteTree.createNode();
        topView(root);
    }

    public static void topView(Node root) {
        class Pair {
            Node node;
            int nodeValue;

            public Pair(int nodeValue, Node node) {
                this.node = node;
                this.nodeValue = nodeValue;
            }
        }
        if(root==null){return;}
        Queue<Pair > pairs=  new LinkedList<>();
        HashMap<Integer,Node> integerNodeHashMap=new HashMap<>();
        pairs.add(new Pair(0,root));
        while (!pairs.isEmpty()){
            Pair pair=pairs.poll();
            if (!integerNodeHashMap.containsKey(pair.nodeValue)){
                integerNodeHashMap.put(pair.nodeValue,pair.node);
            }
            if(pair.node.left!=null){
                pairs.add(new Pair(pair.nodeValue-1,pair.node.left));
            }
            if(pair.node.right!=null){
                pairs.add(new Pair(pair.nodeValue+1,pair.node.right));
            }

        }
        for (Map.Entry<Integer, Node> entry :
                integerNodeHashMap.entrySet()) {
            System.out.print(entry.getValue().value + " ");
        }
    }
}

