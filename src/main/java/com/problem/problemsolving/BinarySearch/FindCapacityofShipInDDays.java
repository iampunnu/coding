package com.problem.problemsolving.BinarySearch;

public class FindCapacityofShipInDDays {
    public static void main(String[] args) {
        int ship[]={1, 2, 1};
        int D=2;
        int mincap=Integer.MIN_VALUE;
        int maxcap=0;
        for(int i=0;i<ship.length;i++){
            mincap= Math.max(mincap,ship[i]);
            maxcap=maxcap+ship[i];

        }

        /*for(int j=mincap;j<=maxcap;j++){
           int day=dys(ship,j);
           if (day<=D){
               System.out.println(day +" capacity "+j);
               break;
           }
        }*/
        int ans=-1;
       // System.out.println(ans);

        while (mincap<=maxcap){
            int m=(maxcap+mincap)/2;
            if(dys(ship,m)<=D){
                ans=m;
               // System.out.println(ans);
                maxcap=m-1;
            }
            else {
                mincap=m+1;
            }
        }
        System.out.println(ans);

    }

    public static int dys(int ship[],int cap){
        int days=1; int load=0;
        for(int i=0;i<ship.length;i++){
            if((ship[i]+load)>cap){
                days=days+1;
                load=ship[i];
            }
            else {load=load+ship[i];}
        }
        return days;

    }
}
