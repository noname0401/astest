import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改
class juzhen {
    int [][]arr1 =new int [100][100];
    int [][]arr2 =new int [100][100];
    int [][]arr3 =new int [100][100];
//    public void init1(int m,int n){
//        int [][]arr1 =new int [m][n];
//        int [][]arr2 =new int [m][n];
//        int [][]arr3 =new int [m][n];
//    }
//    public void init2(int m,int n,int q){
//        int [][]arr1 =new int [m][n];
//        int [][]arr2 =new int [n][q];
//        int [][]arr3 =new int [m][q];
//    }
    public void sub(int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr3[m][n]=arr1[m][n]-arr2[m][n];
            }
        }
    }
    public void add(int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr3[m][n]=arr1[m][n]+arr2[m][n];
            }
        }
    }
    public void mul(){
        for (int i = 0; i <arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr2[j].length; k++) {
                    arr3[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }
    }
}
public class A3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
         int a=scan.nextInt();
         juzhen c = new juzhen();
         if(a!=3){
        //     System.out.println(a);
             int m=scan.nextInt();
             int n=scan.nextInt();
           //  c.init1(m,n);

             for(int i=0;i<m;i++){
                 for(int j=0;j<n;j++){
                     c.arr1[i][j]=scan.nextInt();
                 }
             }
//             System.out.println("读入数组完毕1");
//             System.out.println(m);
//             System.out.println(n);
             for(int i=0;i<m;i++){
                 for(int j=0;j<n;j++){
                     c.arr2[i][j]=scan.nextInt();
                 }
             }

             for(int i=0;i<m;i++){
                 for(int j=0;j<n;i++){
                     if(j==n-1){
                         System.out.println(c.arr2[i][j]);
                     }
                     System.out.print(c.arr2[i][j]);
                 }
             }
             System.out.println("读入数组完毕2");
             if(a==1){
                 c.add(m,n);
             }else c.sub(m,n);

//             System.out.println(m);
//             System.out.println(n);
             for(int i=0;i<m;i++){
                 for(int j=0;j<n;i++){
                     if(j==n-1){
                         System.out.println(c.arr3[i][j]);
                     }
                     System.out.print(c.arr3[i][j]);
                 }
             }
         }
         else{
             int m=scan.nextInt();
             int n=scan.nextInt();
             int q=scan.nextInt();
            // c.init2(m,n,q);
             for(int i=0;i<m;i++){
                 for(int j=0;j<n;i++){
                     c.arr1[i][j]=scan.nextInt();
                 }
             }
             for(int i=0;i<n;i++){
                 for(int j=0;j<q;j++){
                     c.arr2[n][q]=scan.nextInt();
                 }
             }
             c.mul();

             for(int i=0;i<m;i++){
                 for(int j=0;j<q;i++){
                     if(j==q-1){
                         System.out.println(c.arr3[i][j]);
                     }
                     System.out.print(c.arr3[i][j]);
                 }
             }
         }
        }
        scan.close();
    }
}
