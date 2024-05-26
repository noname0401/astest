package test2;
//
//import java.util.Scanner;
//class point{
//    int x;
//    int y;
//    point(int x,int y){
//        this.x=x;
//        this.y=y;
//    }
//}
//class juxing{
//    point p1,p2,p3,p4;
//    juxing(point p1,point p2,point p3,point p4){
//        this.p1=p1;
//        this.p2=p2;
//        this.p3=p3;
//        this.p4=p4;
//    }
//    int a=p1.x-p3.x;
//    int b=p1.y-p2.y;
//   double a1=Math.sqrt(a*a);
//   double b1=Math.sqrt(b*b);
////    public double fun1(){
////        int a=p1.x-p3.x;
////
////        double a1=Math.sqrt(a*a);
////
////        return a1;
////    }
////    public double fun2(){
////
////        int b=p1.y-p2.y;
////
////        double b1=Math.sqrt(b*b);
////        return b1;
////    }
//    public void area(){
//
//            System.out.println("面积:"+a1*b1);
//    }
//    public void length(){
//
//        System.out.println("周长:"+(a1+b1)*2);
//    }
//}
//public class shiyan21 {
//    public static void main(String[] args){
//        Scanner input=new Scanner(System.in);
//        while(input.hasNext()) {
//            int x1,y1,x2,y2,x3,y3,y4,x4;
//            x1=input.nextInt();
//            y1=input.nextInt();
//            x2=input.nextInt();
//            y2=input.nextInt();
//            x3=input.nextInt();
//            y3=input.nextInt();
//            x4=input.nextInt();
//            y4=input.nextInt();
//            point p1=new point(x1,y1);
//            point p2=new point(x2,y2);
//            point p3=new point(x3,y3);
//            point p4=new point(x4,y4);
//            juxing s=new juxing(p1,p2,p3,p4);
//            s.area();
//            s.length();
//
//            }
//        }
//    }
//


import java.util.Scanner;

public class shiyan21 {

    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Point p = new Point(a, b);
            juxing jx = new juxing(p);
            jx.mianji();
            jx.zhouchang();
        }
    }
}
class  Point{
    int x,y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class juxing {
    Point p1;
    juxing(Point p1) {
        this.p1 = p1;
    }
    void  zhouchang(){
        System.out.println("周长："+2*(p1.x+ p1.y));
    }
    void mianji(){
        System.out.println("面积："+p1.x* p1.y);
    }
}