package kaoshi;
import java.util.Scanner;
public class A {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.printf("%.2f\n", a + b);
        }
    }
}
