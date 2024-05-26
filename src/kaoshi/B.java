
package kaoshi;
import java.util.Scanner;
public class B {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int [][]arr= new int[50][50];

        while (sc.hasNext()) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j > n-i) {
                        System.out.print(x);
                    } else {
                        System.out.print(10-x);
                    }
                }
                System.out.println();
            }
        }
    }
}
//        333333333337
//        333333333377
//        333333333777
//        333333337777
//        333333377777
//        333333777777
//        333337777777
//        333377777777
//        333777777777
//        337777777777
//        377777777777
//        777777777777