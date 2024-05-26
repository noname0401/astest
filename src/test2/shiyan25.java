package test2;


import java.util.Scanner;

public class shiyan25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Underguaduate u=new Underguaduate();
        u.Student(a,b,c);
        u.pri();
        Graduate g =new Graduate();
        int e=sc.nextInt();
        int f=sc.nextInt();
        int gg=sc.nextInt();
        g.Student(e,f,gg);
        g.pri();
    }
}
class Student{
    int fenshu1;
    int fenshu2;
    int fenshu3;
    public void Student(int fenshu1, int fenshu2, int fenshu3) {
        this.fenshu1 = fenshu1;
        this.fenshu2 = fenshu2;
        this.fenshu3 = fenshu3;
    }
    public void pri(){
        System.out.println("abcdefg");
    }

}
class Underguaduate extends Student{

    public void pri(){
        int sum=fenshu1+fenshu2+fenshu3;
        if(sum/3>60){
            System.out.println("本科生：您已取得学位！");}
        else {
            System.out.println("本科生：成绩不合格，没有学位");
        }
    }
}
class  Graduate extends Student{

    public void pri(){
        int sum=fenshu1+fenshu2+fenshu3;
        if(sum/3>60){
            System.out.println("研究生：您已取得学位！");}
        else {
            System.out.println("研究生：成绩不合格，没有学位");
        }
    }
}