package kaoshi;

import java.util.Scanner;

public class C {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int flag=0;
            if(a>b){
                int temp=b;
                b=a;
                a=temp;
            }
            for(int i=a;i<=b;i++ ){
                if(i%x==0){
                    System.out.printf("%6d",i);
                    flag++;
                    if(flag==10){
                        System.out.println();
                        flag=0;
                    }
                }
            }
            if(flag!=0){
                System.out.println();
            }

        }
    }
}
//    Sample Input
//64 12 5
//        14 300 8
//        Sample Output
//        15    20    25    30    35    40    45    50    55    60
//        16    24    32    40    48    56    64    72    80    88
//        96   104   112   120   128   136   144   152   160   168
//        176   184   192   200   208   216   224   232   240   248
//        256   264   272   280   288   296
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int x = scanner.nextInt();
//            int count = 0;
//            for (int i = a; i <= b; i++) {
//                if (i % x == 0) {
//                    System.out.printf("%6d", i);
//                    count++;
//                    if (count == 10) {
//                        System.out.println();
//                        count = 0;
//                    }
//                }
//            }
//            if (count != 0) { // 如果还有剩余的没有输出，则换行。
//                System.out.println();
//            }
//        }
//    }
//}