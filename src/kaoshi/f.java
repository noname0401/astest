package kaoshi;
public class f {
    public static void main(String[] args) {
        for (int i = 123; i <= 987 / 3; i++) {
            for (int j = i * 2; j <= 987 / 2; j++) {
                int k = i + j;
                if (isPandigital(i, j, k)) {
                    System.out.println(i + "+" + j + "=" + k);
                }
            }
        }
    }

    private static boolean isPandigital(int a, int b, int c) {
        String s = "" + a + b + c;
        if (s.length() != 9) {
            return false;
        }
        for (int i = 1; i <= 9; i++) {
            if (!s.contains("" + i)) {
                return false;
            }
        }
        return true;
    }
}
//
//public class E {
//    public static void main(String[] args) {
//        for (int a = 1; a <= 9; a++) {
//            for (int b = 1; b <= 9; b++) {
//                if (a == b) continue;
//                for (int c = 1; c <= 9; c++) {
//                    if (c == a || c == b) continue;
//                    int abc = a * 100 + b * 10 + c;
//                    for (int d = 1; d <= 9; d++) {
//                        if (d == a || d == b || d == c) continue;
//                        for (int e = 1; e <= 9; e++) {
//                            if (e == a || e == b || e == c || e == d) continue;
//                            int de = d * 10 + e;
//                            int f = abc - de;
//                            if (f < 1 || f > 9 || f == a || f == b || f == c || f == d || f == e) {
//                                continue;
//                            }
//                            int aab = a * 10 + a + b;
//                            int ffc = f * 10 + f + c;
//                            if (aab + de == ffc) {
//                                System.out.printf("%d+%d=%d\n", aab, de, ffc);
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
