package com.problem.problemsolving.Serilization;

public class serilizationchild extends Serilizationparent{
    public serilizationchild(String childFather,String name,String addres) {
        super(name,addres);
        this.childFather = childFather;
    }

    String childFather;
     static String zend="123";

     @Override
    public void sum(){}

}
