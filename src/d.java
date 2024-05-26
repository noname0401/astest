import java.util.Scanner;
public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[100];

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt(); //
        }
        int cnt = 0;
        int flag=0;
        int [][] ans = new int[100][100];
        for (int i = 1; i <= n; ){
            int tot = 1;
            int [] b = new int [100];
            b[1] = a[i];
            for (int j = i+1; j <= n; j++){
                if (a[j] > b[tot]){
                    b[++tot] = a[j];
                } else break;
            }
            if (tot > 1) {
                b[0] = tot;
              //  ans[++cnt][flag++] = b[0];
                ans[++cnt] = b;
            }
            i += tot;
        }
        System.out.println(cnt);
        for (int i = 1; i <= cnt; i++){
            int len = ans[i][0];
            for (int j = 1; j < len; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println(ans[i][len]);
        }
        }
    }

//
