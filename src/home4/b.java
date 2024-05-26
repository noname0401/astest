package home4;

import java.util.Scanner;

//派生类
class circle {
    double radis;

    public circle(int radis) {
        this.radis = radis;
    }

    protected double computeArae() {
        double area = 3.14 * radis * radis;
        return area;
    }
}

class Cylinder extends circle {
    double high;

    public Cylinder(double high, int radis) {
      //  this.radis=radis;
        super(radis);//调用父类含有这个参数的构造方法
        this.high = high;
        //this.radis=radis;
    }

    public double v() {
        return computeArae() * this.high;
    }
}

public class b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n != 0) {
            n--;
            int r, h;
            r = input.nextInt();
            h = input.nextInt();
            Cylinder cc = new Cylinder(h, r);

            System.out.printf("%.2f\n", cc.v());
        }
    }
}






