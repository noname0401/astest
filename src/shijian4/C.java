package shijian4;
import java.util.*;
import java.util.regex.*;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String flag = scanner.nextLine();
            String str = scanner.nextLine();

            switch (flag) {
                case "A":
                    double sum = 0.0;
                    Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
                    Matcher matcher = pattern.matcher(str);
                    while (matcher.find()) {
                        sum += Double.parseDouble(matcher.group());
                    }
                    System.out.printf("%.2f\n", sum);
                    break;
                case "B":
                    int count = 0;
                    for (char c : str.toCharArray()) {
                        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                            count++;
                        }
                    }
                    System.out.println(count);
                    break;
                case "C":
                    int numCount = 0;
                    for (char c : str.toCharArray()) {
                        if (c >= '0' && c <= '9') {
                            numCount++;
                        }
                    }
                    System.out.println(numCount);
                    break;
                case "D":
                    List<String> phoneList = new ArrayList<>();
                 //   Pattern phonePattern = Pattern.compile("(1\\d{10}|/0\\d{2,3}-\\d{7,8}/)");
                    Pattern phonePattern = Pattern.compile("\\b(\\d{6,7}|1\\d{10})\\b");
                    Matcher phoneMatcher = phonePattern.matcher(str);
                    while (phoneMatcher.find()) {
                        phoneList.add(phoneMatcher.group());
                    }
                    System.out.println(String.join(",", phoneList));
                    break;
                default:
                    break;
            }
        }
    }
}
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class C{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            String flag = scanner.nextLine();  // 提取标识
//            String input = scanner.nextLine(); // 待处理的字符串
//
//            if (flag.equals("A")) {
//                double sum = A(input);
//                System.out.printf("%.2f\n", sum);
//            } else if (flag.equals("B")) {
//                int count = B(input);
//                System.out.println(count);
//            } else if (flag.equals("C")) {
//                int count = C(input);
//                System.out.println(count);
//            } else if (flag.equals("D")) {
//                String phoneNumbers = D(input);
//                System.out.println(phoneNumbers);
//            }
//        }
//    }
//
//    private static double A(String input) {
//        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");  // 正则表达式匹配数字
//        Matcher matcher = pattern.matcher(input);
//
//        double sum = 0;
//        while (matcher.find()) {
//            String number = matcher.group();
//            sum += Double.parseDouble(number);
//        }
//
//        return sum;
//    }
//
//    private static int B(String input) {
//        int count = 0;
//        for (char c : input.toCharArray()) {
//            if (c>=65&&c<=90) {
//                count++;
//            }
//            else if(c>=97&&c<=122){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    private static int C(String input) {
//        int count = 0;
//        for (char c : input.toCharArray()) {
//            if (Character.isDigit(c)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    private static String D(String input) {
//        Pattern pattern = Pattern.compile("\\b(\\d{7,8}|1\\d{10})\\b");  // 正则表达式匹配电话号码
//        Matcher matcher = pattern.matcher(input);
//
//        StringBuilder sb = new StringBuilder();
//        while (matcher.find()) {
//            String phoneNumber = matcher.group();
//            sb.append(phoneNumber).append(",");
//        }
//
//        if (sb.length() > 0) {
//            sb.deleteCharAt(sb.length() - 1);  // 删除最后一个逗号
//        }
//
//        return sb.toString();
//    }
//}
