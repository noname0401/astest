package home5;

import java.util.Scanner;

interface IComVolume{
    public double PI=3.14;
    public double computeVolume();
}

class Cylinders implements IComVolume{
    double r;
    double h;
    public Cylinders(double r,double h){
        this.r=r;
        this.h=h;
    }

    public double computeVolume(){
        return (IComVolume.PI*r*r*h);
    }
}
class block implements IComVolume{
    double a;
    double b;
    double c;

    public block(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double computeVolume(){
        return a*b*c;
    }
}
public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n!=0){
            n--;
            IComVolume icv;
            char c=input.next().charAt(0);
            if(c=='c'){
                double r=input.nextDouble();
                double h=input.nextDouble();
                 icv=new Cylinders(r,h);
                System.out.printf("Cylinder:%.2f\n",icv.computeVolume());
            }
            else if(c=='b'){
                double a=input.nextDouble();
                double b=input.nextDouble();
                double x=input.nextDouble();
                 icv=new block(a,b,x);
                System.out.printf("Block:%.2f\n",icv.computeVolume());
            }
        }
    }
}


