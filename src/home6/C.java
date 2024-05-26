package home6;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
//public class C {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//
//        while(in.hasNext()) {
//
//            String s=in.nextLine();
//            Scanner sc=new Scanner(s);
//            int a=0;
//            sc.useDelimiter("[^0-9]+");
//            while(sc.hasNext())
//            {
//                a+=sc.nextInt();}
//                System.out.println((int)a);
//        }
//    }
//}
public class C{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        String regex ="\\d+";
        String str=scan.nextLine();
        Pattern p =Pattern.compile(regex);
        Matcher m =p.matcher(str);
        while(m.find()){
            String s=m.group();
            System.out.println(s);
        }
    }
}
/*
Description
        现有多行字符串，要求从每行字符串中提取数据，连续的数字作为一个整体，然后求和输出。没有浮点、长整型情况。
        参照教材示例。
        Input
        每行一个字符串。
        Output
        每行一个整数。参见样例
        Sample Input
        skj200 4040tooeikfkf3460
        345dkjd345 3910sse
        Sample Output
        7700
        4600
*/
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

//public class C {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            int sum = 0;
//            Pattern pattern = Pattern.compile("\\d+"); // 匹配数字
//            Matcher matcher = pattern.matcher(line);
//            while (matcher.find()) {
//                sum += Integer.parseInt(matcher.group()); // 将找到的数字累加到sum中
//            }
//            System.out.println(sum);
//        }
//    }
//}