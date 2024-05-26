//import java.util.Scanner;
//
//public class Circle {//定义一个圆类
//    int x;
//    int y;
//    int r;
//
//    public void init(int x,int y,int r){//初始化一个圆的方法
//        this.x=x;
//        this.y=y;
//        this.r=r;
//    }
//
//    public void fun(int x1,int y1,int r1,int x2,int y2,int r2){//比较两个圆位置距离的方法
//        int len=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
//        if(len>(r1+r2)*(r1+r2)||len<(r1-r2)*(r1-r2)){
//            System.out.println("They are disjoint.");
//        }
//        else if(len==(r1-r2)*(r1-r2)){
//            System.out.println("They are tangent.");
//        }
//        else{
//            System.out.println("They are intersectant.");
//        }
//    }
//}
//public class CircleTest {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        while(n!=0){
//            n--;
//            Circle c1=new Circle();//定义第一个圆并初始化
//            c1.x=sc.nextInt();
//            c1.y=sc.nextInt();
//            c1.r=sc.nextInt();
//
//            Circle c2=new Circle();//定义第二个圆并初始化
//            c2.x=sc.nextInt();
//            c2.y=sc.nextInt();
//            c2.r=sc.nextInt();
//
//            c1.fun(c1.x,c1.y,c1.r,c2.x,c2.y,c2.r);//调用比较圆位置的方法
//        }
//    }
//}