package home3;
import java.util.Scanner;
class point{
    int x;
    int y;
    point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class sj{
    point p1,p2,p3;//三个点
    sj(point p1,point p2,point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }

    public void carea(){
        double a=Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
        double b=Math.sqrt((p1.x-p3.x)*(p1.x-p3.x)+(p1.y-p3.y)*(p1.y-p3.y));
        double c=Math.sqrt((p3.x-p2.x)*(p3.x-p2.x)+(p3.y-p2.y)*(p3.y-p2.x));
        double f=(a+b+c)/2;
        double s=Math.sqrt(f*(f-a)*(f-b)*(f-c));
        System.out.printf("%.2f %.2f",a+b+c,s);
        System.out.println();
    }

    sj move(int z1,int z2){
        point pp1=new point(this.p1.x+z1,this.p1.y+z2);
        point pp2=new point(this.p2.x+z1,this.p2.y+z2);
        point pp3=new point(this.p3.x+z1,this.p3.y+z2);
        return new sj(pp1,pp2,pp3);
    }

    sj xz(int jiaodu){
        if(jiaodu==90){
            point pp1=new point(p1.y,-p1.x);
            point pp2=new point(p2.y,-p2.x);
            point pp3=new point(p3.y,-p3.x);
            return new sj(pp1,pp2,pp3);
        }
        else if(jiaodu==180){
            point pp1=new point(-p1.x,-p1.y);
            point pp2=new point(-p2.x,-p2.y);
            point pp3=new point(-p3.x,-p3.y);
            return new sj(pp1,pp2,pp3);
        }
        else {
            point pp1=new point(-p1.y,p1.x);
            point pp2=new point(-p2.y,p2.x);
            point pp3=new point(-p3.y,p3.x);
            return new sj(pp1,pp2,pp3);
        }
    }

    void print(){
        System.out.println(this.p1.x+" "+this.p1.y+" "+this.p2.x+" "+this.p2.y+" "+this.p3.x+" "+this.p3.y);
    }
}
public class B {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()) {
            int f;
            f = input.nextInt();
            int x1,y1,x2,y2,x3,y3;
            x1=input.nextInt();
            y1=input.nextInt();
            x2=input.nextInt();
            y2=input.nextInt();
            x3=input.nextInt();
            y3=input.nextInt();

            point p1=new point(x1,y1);
            point p2=new point(x2,y2);
            point p3=new point(x3,y3);

            sj s=new sj(p1,p2,p3);

            if(f==1){
                s.carea();
            }
            else if(f==2){
                int c1,c2;
                c1=input.nextInt();
                c2=input.nextInt();
                sj s1=s.move(c1,c2);
                s1.print();
            }
            else if(f==3){
                int jd=input.nextInt();
                sj s1=s.xz(jd);
                s1.print();
            }
        }
    }
}


