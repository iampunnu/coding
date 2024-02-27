package com.problem.problemsolving.numberSystem;

public class Anagram {
    public static void main(StringT[] args) {

        int n=1543;
        int temp=n;
        int count=totoalNumber(n);
        System.out.println(count);
        double sum=0;
        while (temp!=0){
            System.out.print(temp%10+" ");
            sum=sum+pow(temp%10,count);
            temp=temp/10;
        }
        System.out.println(sum);
        if (sum==n){
            System.out.println("Anstagram number");

        }
    }
    public static int totoalNumber(int n){
        int count=0;
        while (n!=0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static double pow(int x,int y){
         double ans=1d;

        if (y==0){return 1;}
        else if(y%2==0){
            ans=ans*Math.pow(x,y/2)*Math.pow(x,y/2);
            return ans;
        }
        else return ans*x*Math.pow(x,y/2)*Math.pow(x,y/2);
    }
}
