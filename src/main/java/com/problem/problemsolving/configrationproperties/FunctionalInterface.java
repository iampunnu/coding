package com.problem.problemsolving.configrationproperties;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@java.lang.FunctionalInterface
 interface A{
    public void show(int a,int b);
    //public  void p();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        A a=(int c,int b)->{
                System.out.println("praveen " + (c+b));

        };
        a.show(10,12);
        List<Integer> i=new ArrayList<>();
        i.add(10);
        i.add(12);
        i.add(13);
        i.add(9);
       // Stream<Integer> i1=i.stream();

        // Stream<Integer> i2= i1.sorted();
        Consumer<Integer> c=n-> System.out.println(n);
        //i1.forEach(c);
      //  i2.forEach(c);
       // Stream<Integer> i3=i2.map(n->2*n);
       // i3.forEach(c);
       // i.stream().sorted().map(n->n*2).forEach(c);
        //using filter also
       // i.stream().sorted().filter(n->n%2==1).map(n->n*2).forEach(c);
        ///map Reduce
        System.out.println( i.stream().sorted().filter(n->n%2==1).map(n->n*2).reduce(Integer.MAX_VALUE,(d,e)->(d<e)?d:e));
      // i= i.stream().sorted().collect(Collectors.toList());
      //  System.out.println(i.toString());




    }
}
