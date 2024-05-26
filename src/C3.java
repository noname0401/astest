import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class C3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        while(scan.hasNextInt()){
            int a=scan.nextInt();
            int b=scan.nextInt();
            int temp=0;
            if(a>b){
                temp=a;
                a=b;
                b=temp;

            }
            for(int j=b;;j--){
                if(b%j==0&&a%j==0){
                    System.out.print(j+",");
                    break;
                }
            }
            //    System.out.println(",");
            for(int i=1;;i++){
                if(i%a==0&&i%b==0){
                    System.out.println(i);
                    break;
                }
            }
        }
        scan.close();
    }
}