package com.problem.problemsolving.Tree.binaryTree.practice;

import com.problem.problemsolving.LinkList.LinkList;
import com.problem.problemsolving.Queue.Qnode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopView {
    public static void main(String[] args) {
        Tree  tree=new Tree();
        tree.CreateTreeHelper();
        topView(tree.root);
    }



    public static void topView(Node root){
         class Pair{
            int hd;
            Node node;
            Pair(int hd,Node node){
                this.hd=hd;
                this.node=node;
            }
        }
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer,Integer>  map=new HashMap<>();
        queue.add(new Pair(0,root));
        while (!queue.isEmpty()){
            Pair p=queue.poll();
            if (!map.containsKey(p.hd)){
                map.put(p.hd,p.node.data);
            }
            if(p.node.right!=null){
                queue.add(new Pair(p.hd-1,p.node.left));
            }
            if (p.node.right!=null){
                queue.add(new Pair(p.hd+1,p.node.right));
            }
        }
        for (Map.Entry<Integer,Integer> integerEntry:map.entrySet()){
            System.out.println(integerEntry.getKey()+" "+integerEntry.getValue());
        }


    }


}
