import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

class aa {
    class bb{};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println(a+b);
        scan.close();
    }
}