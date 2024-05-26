package home3;

import java.util.*;
class juZhen
{

    int a[][]=new int[100][100];//定义两个数组
    int b[][]=new int[100][100];
    void jia(int n,int m)
    {
        int c[][]=new int[100][100];//定义加和出来的数组
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==m-1)
                {
                    System.out.printf("%d",c[i][j]);
                }
                else System.out.printf("%d ",c[i][j]);

            }
            System.out.println();
        }
        //输出
    }
    void jian(int n,int m)
    {
        int c[][]=new int[1001][1001];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==m-1)
                {
                    System.out.printf("%d",c[i][j]);
                }
                else System.out.printf("%d ",c[i][j]);
            }
            System.out.println();
        }
    }
    void cheng(int n,int m,int k)
    {
        int c[][]=new int[100][100];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                for(int l=0;l<m;l++)
                {
                    c[i][j]+=a[i][l]*b[l][j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(j==k-1)
                {
                    System.out.printf("%d",c[i][j]);
                }
                else System.out.printf("%d ",c[i][j]);
            }
            System.out.println();
        }
    }
}
public class A {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while(input.hasNextInt())
        {
            int q,n,m,k=0;
            q=input.nextInt();
            n= input.nextInt();
            m= input.nextInt();
            juZhen p=new juZhen();
            if(q==3)
            {
                k = input.nextInt();
            }
            if(q!=3)
            {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        p.a[i][j] = input.nextInt();
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        p.b[i][j] = input.nextInt();
                    }
                }
            }
            if(q==3)
            {
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        p.a[i][j]= input.nextInt();
                    }
                }
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<k;j++)
                    {
                        p.b[i][j]= input.nextInt();
                    }
                }
            }
            if(q==1)
            {
                p.jia(n,m);
            }
            if(q==2)
            {
                p.jian(n,m);
            }
            if(q==3)
            {
                p.cheng(n,m,k);
            }

        }

    }
}
