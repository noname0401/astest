package shijian1;
import java.util.Scanner;
public class C {
     public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
       // int n = sc.nextInt();
//        for (int i = 2; i*i <= n; i++){
//            if (n%i == 0){
//                System.out.println(n/i);
//                break;
//            }
//        }
//         String str=sc.next();
//         for(int i=0;i<str.length();i++){
//            System.out.println(str.charAt(i));
//         }

         String input = sc.next();
//       //  char ch = input.charAt(0);
//         System.out.println("获取到的字符为：" + input);
//         sc.close();
         int nlen=input.length();
         char []arr=input.toCharArray();
        for(int i=0;i<nlen;i++){
            System.out.println(arr[i]);
        }
    }
}
