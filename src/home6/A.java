package home6;

import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        while (input.hasNext()) {
            try {
                String s = input.next();
                n = Integer.parseInt(s);
                System.out.println(n);
            }
            catch (NumberFormatException e)
            {

            }
        }
    }
}
/*
Description
给定多个整数，里面有不正常的（可能由于有手误等情况造成有异常数据存在，比如123a、123.5、e等），把所有正常的整数全部都输出。
要求：需要采用异常处理的方式，解决问题。
Input
每行一个整数，可能有异常情况的。
Output
每行一个整数。参加样例
Sample Input
123345
123a
123.5
e
98000
Sample Output
123345
98000
*/