package home4;

import java.util.*;

abstract class Graphic {
    public abstract double computeArea();
}

class Circle extends Graphic {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return radius * radius * 3.14;
    }
}

class Rectangle extends Graphic {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double computeArea() {
        return length * width;
    }
}

public class c {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Graphic g;
        while (n != 0) {
            n--;
            char f;
            f = in.next().charAt(0);
            if (f == 'r') {
                float a = in.nextFloat();
                float b = in.nextFloat();
                g = new Rectangle(a, b);
                System.out.printf("Rectangle:%.2f\n", g.computeArea());
            }
            if (f == 'c') {
                float r = in.nextFloat();
                g = new Circle(r);
                System.out.printf("Circle:%.2f\n", g.computeArea());
            }
        }
    }
}


