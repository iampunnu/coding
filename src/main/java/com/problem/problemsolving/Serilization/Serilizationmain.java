package com.problem.problemsolving.Serilization;

import java.io.*;
import java.util.*;

public class Serilizationmain {
    static String name="praveen";
volatile List<String> strings=new ArrayList<>();
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        serilizationchild serilizationchild=new serilizationchild("surendra","praveen","dema");
        serilizationchild.zend="123456";
        String kl="praveen";
        String pk=new String("praveen");
        System.out.println(name.hashCode()+" "+kl.hashCode()+" "+pk.hashCode());
        StringBuffer s=new StringBuffer("aaabcdfaa");
        s.replace(0,3,"");
        System.out.println(s);
        FileOutputStream fileOutputStream=new FileOutputStream("par.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serilizationchild);
        objectOutputStream.close();
        objectOutputStream.close();
        FileInputStream fileInputStream=new FileInputStream("par.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        serilizationchild serilizationchild1=(serilizationchild)objectInputStream.readObject();
        System.out.println(serilizationchild1.name);

        PriorityQueue<Integer> integers=new PriorityQueue<>((a,b)->a-b);
        integers.add(10);
        integers.add(20);
        integers.add(40);
        integers.add(5);
        System.out.println(integers.poll());
        System.out.println(integers.poll());
        Map<Integer,Integer> map=new TreeMap<>();
        map.put(2,4);
        map.put(3,4);
        System.out.println(map.get(2)+" "+map.get(3));


    }
}
