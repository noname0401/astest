package shijian4;

import java.util.Scanner;

public class A {
    public static void main(String args[]) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        double sum = 0;
        for(int i=0;i<n;i++){
            int num=input.nextInt();
            for(int j=0;j<num;j++){
                sum+=input.nextInt();
            }
            System.out.printf("%.2f\n",sum/num);
            sum=0;
        }
    }
}
