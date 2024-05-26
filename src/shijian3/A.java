package shijian3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
        int x,y,z;
        for(int i=-10000;i<10000;i++){
           x= (int) Math.sqrt(i+100);
           y= (int) Math.sqrt(i+268);
           if((x*x==i+100)&&(y*y==i+268)){
               System.out.println(i);
           }
        }
}
}
