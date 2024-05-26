package shijian3;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[100][100];
        int i, j, n, k;
        while (scan.hasNextInt()) {
            n = scan.nextInt();
            k = 1;

            //输出上三角
            if (n % 2 == 1) {
                for (i = 1; i <= n; i++)
                    for (j = 1; j <= i; j++) {
                        if (i % 2 == 0)
                            arr[i + 1 - j][j] = k;
                        else
                            arr[j][i + 1 - j] = k;
                        k++;
                    }
            } else {
                for (i = 1; i <= n; i++)
                    for (j = 1; j <= i; j++) {
                        if (i % 2 == 1)
                            arr[i + 1 - j][j] = k;
                        else
                            arr[j][i + 1 - j] = k;
                        k++;
                    }
            }

            int flag = n;
            for (i = 1; i <= n; i++) {
              //  printf("\n");
                for (j = 1; j <= flag; j++) {
                    if(j==flag){
                       // System.out.println("%5d",arr[i][j]);
                        System.out.printf("%5d",arr[i][j]);
                        System.out.println();
                    }
                    else{
                        System.out.printf("%5d",arr[i][j]);
                    }

                }
                flag--;
            }
         //   System.out.println();
        }
    }
}