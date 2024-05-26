//package test;
//import java.util.Scanner;
//public class shiyan11 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//
//    }
//}
package test;
import javax.swing.JOptionPane;

public class shiyan11
{
    public static void main(String args[])
    {
        int number=0,d5,d4,d3,d2,d1;
        String str=JOptionPane.showInputDialog("输入一个 1 至 99999 之间的数");
        number=Integer.parseInt(str);
        if(number>=1&&number<=99999) //判断 number 在 1 至 99999 之间的条件
        {

  d5=number/10000;
  //计算 number 的最高位（万位）d5
 d4=number/1000%10; //计算 number 的千位 d4
d3=number/100%10; //计算 number 的百位 d3
            d2=number%100/10;
            d1=number%10;
            if(d5!=0) //判断 number 是 5 位数的条件
            {
                System.out.println(number+"是 5 位数");
                if(d5 == d1 && d4 == d2) //判断 number 是回文数的条件
                {
                    System.out.println(number+"是回文数");
                }
 else
                {
                    System.out.println(number+"不是回文数");
                }
            }
 else if(d4!=0) //判断 number 是 4 位数的条件
            {
                System.out.println(number+"是 4 位数");
                if(d4==d1&&d3==d2) //判断 number 是回文数的条件码
                {
                    System.out.println(number+"是回文数");
                }
 else
                {
                    System.out.println(number+"不是回文数");
                }
            }
 else if(d3!=0) //判断 number 是 3 位数的条件
            {
                System.out.println(number+"是 3 位数");
                if(d3==d1) //判断 number 是回文数的条件
                {
                    System.out.println(number+"是回文数");
                }
 else
                {
                    System.out.println(number+"不是回文数");
                }
            }
 else if(d2!=0)
        {
            System.out.println(number+"是 2 位数");
            if(d1==d2)
            {
                System.out.println(number+"是回文数");
            }
            else
            {
                System.out.println(number+"不是回文数");
            }
        }
        else if(d1!=0)
        {
            System.out.println(number+"是 1 位数");
            System.out.println(number+"是回文数");
        }
        }
 else
        {
            System.out.printf("\n%d 不在 1 至 99999 之间",number);
        }
    }
}
