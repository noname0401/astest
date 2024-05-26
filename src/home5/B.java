package home5;

import java.util.Scanner;

class ball1{
    private double r;
    static int n=0;//个数
    static double rsum=0;//总半径和
    static double errsum=0;//总误差绝对值和
    ball1(double r){
        this.r=r;
    }

    public static void addball(double r){
        n++;
        rsum+=r;
    }

    public static void adderr(double err) {
        errsum += err;
    }

    public static double getRsum(){
        return rsum;
    }

    public static double geterr(){
        return errsum;
    }
}
public class B {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        double r[]=new double[n];
       // double r=0;
        ball1 s=new ball1(0);

        for(int i=0;i<n;i++){
            r[i]=input.nextDouble();
            s=new ball1(r[i]);
            s.addball(r[i]);
        }

        double avg=s.getRsum()/s.n;

        for (int i=0;i<n;i++){
            if(avg-r[i]>0){
                s.adderr(avg-r[i]);

            }else{
                s.adderr(r[i]-avg);
            }
        }

        System.out.printf("%.2f,%.2f\n",avg,s.geterr()/n);

    }
}


