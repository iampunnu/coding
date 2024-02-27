package com.problem.problemsolving.Serilization;

public class LoadClass {
    static {
        System.out.println("inside static");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.problem.problemsolving.Serilization.LoadClass");
    }
}
