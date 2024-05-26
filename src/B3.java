//import java.util.Scanner;
//// 1:无需package
//// 2: 类名必须Main, 不可修改
//class point {
//    int x1,x2,y1,y2,z1,z2;
//    public double fun1(){
//        double len1= Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
//        double len2=  Math.sqrt((x1-x2)*(x1-x2)+(z1-z2)*(z1-z2));
//        double len3=  Math.sqrt((z1-z2)*(z1-z2)+(y1-y2)*(y1-y2));
//        return len1+len2+len3;
//    }
//    public void dun2(){
//
//    }
//
//    public void fun3(int x,int y){
//        x1+=x;
//        x2+=y;
//        y1+=x;
//        y2+=y;
//        z1+=x;
//        z2+=y;
//    }
//    public void fun4(){
//
//    }
//    int [][]arr1 =new int [100][100];
//    int [][]arr2 =new int [100][100];
//    int [][]arr3 =new int [100][100];
//    public void add(int m,int n){
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                arr3[m][n]=arr1[m][n]+arr2[m][n];
//            }
//        }
//    }
//    public void mul(){
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                for (int k = 0; k < arr2[j].length; k++) {
//                    arr3[i][k] += arr1[i][j] * arr2[j][k];
//                }
//            }
//        }
//    }
//}
//public class B3 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        //在此输入您的代码...
//        while(scan.hasNextInt()){
//            int a=scan.nextInt();
//            juzhen c=new juzhen();
//            if(a!=3){
//                int m=scan.nextInt();
//                int n=scan.nextInt();
//
//                for(int i=0;i<m;i++){
//                    for(int j=0;j<n;j++){
//                        c.arr1[i][j]=scan.nextInt();
//                    }
//                }
//                for(int i=0;i<m;i++){
//                    for(int j=0;j<n;i++){
//                        c.arr2[i][j]=scan.nextInt();
//                    }
//                }
//                c.add(m,n);
//                for(int i=0;i<m;i++){
//                    for(int j=0;j<n;i++){
//                        if(j==n-1){
//                            System.out.println(c.arr3[i][j]);
//                        }
//                        System.out.print(c.arr3[i][j]);
//                    }
//                }
//            }
//            else{
//                int m=scan.nextInt();
//                int n=scan.nextInt();
//                int q=scan.nextInt();
//                //juzhen c=new juzhen();
//                for(int i=0;i<m;i++){
//                    for(int j=0;j<n;i++){
//                        c.arr1[i][j]=scan.nextInt();
//                    }
//                }
//                for(int i=0;i<n;i++){
//                    for(int j=0;j<q;j++){
//                        c.arr2[n][q]=scan.nextInt();
//                    }
//                }
//                c.mul();
//
//                for(int i=0;i<m;i++){
//                    for(int j=0;j<q;i++){
//                        if(j==q-1){
//                            System.out.println(c.arr3[i][j]);
//                        }
//                        System.out.print(c.arr3[i][j]);
//                    }
//                }
//            }
//        }
//        scan.close();
//    }
//}
