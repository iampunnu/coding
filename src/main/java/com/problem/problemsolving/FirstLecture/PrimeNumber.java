package com.problem.problemsolving.FirstLecture;

public class PrimeNumber {
    public static void main(String args[]){
        int dividend=-2147483648;
        int divisor =-1;
        int sign  = ((dividend <= 0) ^ (divisor < 0)) ? -1 : 1;
        System.out.println(sign);
        if(dividend<= 0){
            System.out.println("inside dividend");
            dividend = -1*dividend;}
        if(divisor<= 0){
            divisor = 0-divisor;}
        if(dividend==-2147483648 && divisor==-1){

            System.out.println("ab");        }


        if(dividend==-2147483648 && divisor==1){
            System.out.println("abc");        }

        // Initialize the quotient
        int quotient = 0;
            System.out.println(dividend+" "+divisor);


            while (dividend >= divisor) {
                dividend -= divisor;
                ++quotient;
            }
            // if the sign value computed earlier is -1 then
            // negate the value of quotient
            if (sign == -1){
                quotient = -quotient;}

            System.out.println(quotient);
        int n=43;
        int m=-1;
        m>>=14;
        System.out.println(m);
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println(" non prime");
                break;

            }
        }
    }
}

