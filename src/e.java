import java.util.Scanner;
class Circle {
    int x;
    int y;
    int r;

    public void init(int x,int y,int r){
        this.x=x;
        this.y=y;
        this.r=r;
    }

    public void fun(int x1,int y1,int r1,int x2,int y2,int r2){
        int len=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        if(len>(r1+r2)*(r1+r2)||len<(r1-r2)*(r1-r2)){
            System.out.println("They are disjoint.");
        }
        else if(len==(r1+r2)*(r1+r2)||len==(r1-r2)*(r1-r2)){
            System.out.println("They are tangent.");
        }
        else{
            System.out.println("They are intersectant.");
        }
    }
}
public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Circle c2 = new Circle();
        Circle c1 = new Circle();
        for(int i=0;i<n;i++){
            c1.x = sc.nextInt();
            c1.y = sc.nextInt();
            c1.r = sc.nextInt();
            c2.x = sc.nextInt();
            c2.y = sc.nextInt();
            c2.r = sc.nextInt();

//            int len=(c1.x-c2.x)*(c1.x-c2.x)+(c1.r-c2.y)*(c1.r-c2.y);
//        if(len>(c1.r+c2.r)*(c1.r+c2.r)||len<(c1.r-c2.r)*(c1.r-c2.r)){
//            System.out.println("They are disjoint.");
//        }
//        else if((len==(c1.r+c2.r)*(c1.r+c2.r))||(len==(c1.r-c2.r)*(c1.r-c2.r))){
//            System.out.println("They are tangent.");
//        }
//        else{
//            System.out.println("They are intersectant.");
//        }
            c1.fun(c1.x, c1.y, c1.r, c2.x, c2.y, c2.r);
        }
    }
}