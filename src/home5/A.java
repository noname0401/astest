package home5;

import java.util.Scanner;

class ball{
     double radius;
    public ball(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
}
public class A {
    //对象数组
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        ball s[]=new ball[n];
        double sum=0;
        for(int i=0;i<n;i++){
            double r=input.nextDouble();
            sum+=r;
            s[i]=new ball(r);//初始化
        }
        double avg=sum/n;
        double err=0;
        for(int i=0;i<n;i++){
            if(avg-s[i].getRadius()>0){
                err+=avg-s[i].getRadius();

            }else{
                err-=avg-s[i].getRadius();
            }
        }
        System.out.printf("%.2f,%.2f\n",avg,err/n);
    }
}


