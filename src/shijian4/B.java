package shijian4;

import java.util.Scanner;

public class B {
    public static void main(String args[]) {
        Scanner input =new Scanner(System.in);
        int []arr={31,28,31,30,31,30,31,31,30,31,30,31};
       while(input.hasNextInt()){
               int year= input.nextInt();
               int mouth= input.nextInt();
               int day= input.nextInt();
               int sum=0;
               for(int i=0;i<mouth-1;i++){
                   sum+=arr[i];
               }
               sum+=day;
           if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
               System.out.println(sum+1);
           else
               System.out.println(sum);
            sum=0;
       }
    }
}
