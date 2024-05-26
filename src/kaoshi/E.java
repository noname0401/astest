package kaoshi;

public class E {
    public static void main(String[] args) {
        int []arr=new int[1000];
        for(int i=0;i<1000;i++){
            arr[i]=0;
        }
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 9; b++) {
                if (a == b) continue;
                for (int c = 1; c <= 9; c++) {
                    if (c == a || c == b) continue;
                    int abc = a * 100 + b * 10 + c;

                    for (int d = 1; d <= 9; d++) {
                        if (d == a || d == b || d == c) continue;
                        for (int e = 1; e <= 9; e++) {
                            if (e == a || e == b || e == c || e == d) continue;
                            for (int f = 1; f <= 9; f++) {
                                if (f == a || f == b || f == c || f == d || f == e) continue;
                                int def = d * 100 + e * 10 + f;

                                for (int g = 1; g <= 9; g++) {
                                    if (g == a || g == b || g == c || g == d || g == e || g == f) continue;
                                    for (int h = 1; h <= 9; h++) {
                                        if (h == a || h == b || h == c || h == d || h == e || h == f || h == g)
                                            continue;
                                        for (int i = 1; i <= 9; i++) {
                                            if (i == a || i == b || i == c || i == d || i == e || i == f || i == g || i == h)
                                                continue;
                                            int ghi = g * 100 + h * 10 + i;
                                            if(arr[def]!=1&&arr[abc]!=1) {
                                                if (abc + def == ghi)
                                                {
                                                    System.out.printf("%d+%d=%d\n", abc, def, ghi);
                                                }

                                            }
                                            arr[def] = 1;
                                            arr[abc] = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
/*
* public class E {
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (a == b) continue;
                for (int c = 1; c <= 9; c++) {
                    if (c == a || c == b) continue;
                    int abc = a * 100 + b * 10 + c;
                    for (int d = 1; d <= 9; d++) {
                        if (d == a || d == b || d == c) continue;
                        for (int e = 1; e <= 9; e++) {
                            if (e == a || e == b || e == c || e == d) continue;
                            int de = d * 10 + e;
                            int f = abc - de;
                            if (f < 1 || f > 9 || f == a || f == b || f == c || f == d || f == e) {
                                continue;
                            }
                            int aab = a * 10 + a + b;
                            int ffc = f * 10 + f + c;
                            if (aab + de == ffc) {
                                System.out.printf("%d+%d=%d\n", aab, de, ffc);
                            }
                        }
                    }
                }
            }
        }
    }
}*/