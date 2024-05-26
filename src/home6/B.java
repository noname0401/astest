package home6;

import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, n;
        while (input.hasNext()) {
            try {
                String str = input.next();
                n = Integer.parseInt(str);
                sum = sum + n;
            }
            catch (NumberFormatException e){}

        }System.out.println(sum);
    }
}
/*
Description
现在有很多字符串，由空格和回车分隔。这些字符串有的能正常转换为整数，有的不能。现在要求得所有字符串中能正常转换成整数的数的和。
Input
很多字符串。
Output
输出一个整数。参见样例
Sample Input
200 40 40too 60
300  dkjd345 100 sse

Sample Output
700
*/

