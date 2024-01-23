package com.problem.problemsolving.Queue;

public class nowith123 {
    public static void main(String[] args) {
        int k = 1000;
        int count = 0;
        int ans = 0;
        int no = 1;
        while (true) {
            boolean t=true;
            int start=no;
          //  System.out.println("going for "+start);
            while (start > 0) {
                // Finding the remainder (Last Digit)
                int remainder = start % 10;
                if(remainder==1||remainder==2||remainder==3){

                }
                else {t=false;}
                // Printing the remainder/current last digit
              //  System.out.println(remainder);
                // Removing the last digit/current last digit
                start = start / 10;
            }
            if (t){
               // System.out.println("no contain 123 "+no);
                count++;
                if (count==k){
                ans=no;
                break;}
            }
            no++;

        }
        System.out.println(ans);


    }
}
