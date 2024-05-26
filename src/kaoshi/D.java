package kaoshi;

import java.util.Scanner;
 abstract class Shape {

    public abstract double area();

   // public abstract double volume(double height);
    public abstract double volume();

}

class Rectangle extends Shape {
    private double width;
    private double length;
    private double height;
    public Rectangle(double width, double length,double height) {
        this.width = width;
        this.length = length;
        this.height=height;
    }
    public double area() {
        double rarea=2*(width * length+width * height+height* length);
        return rarea;
    }
    public double volume() {
        return width*height*length;
    }
}

 class Circle extends Shape {
    private double radius;
     private double height;
    public Circle(double radius,double height) {
        this.radius = radius;
        this.height=height;
    }

    public double area() {
        double carea=2*(Math.PI * radius * radius)+(Math.PI*2*radius*height);
        return carea;
    }

    public double volume() {
        return Math.PI*radius*radius*height;
    }

}

class Triangle extends Shape {
    private double a, b, c,height;
    private double tarea=0;
    public Triangle(double a, double b, double c,double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height=height;
    }

    public double area() {
        double p = (a + b + c) / 2;
         this.tarea=Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return 2*tarea+height*(a+b+c);
    }

    public double volume() {
        double p = (a + b + c) / 2;
        this.tarea=Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return this.tarea * height;
    }

}

 class Cylinder {
    private Shape shape;
    private double height;

    public Cylinder(Shape shape) {
        this.shape = shape;

    }

    public double volume() {
        return shape.volume();
    }

    public double area() {
        return shape.area();
    }

}

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String type = scanner.next();
            Shape shape;
            if (type.equals("r")) {
                double width = scanner.nextDouble();
                double length = scanner.nextDouble();
                double height = scanner.nextDouble();
                shape = new Rectangle(width, length,height);
            } else if (type.equals("c")) {
                double radius = scanner.nextDouble();
                double height = scanner.nextDouble();
                shape = new Circle(radius,height);
            } else {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double height = scanner.nextDouble();
                shape = new Triangle(a, b, c,height);
            }

            Cylinder cylinder = new Cylinder(shape);
            double volume = cylinder.volume();
            double area = cylinder.area();
            System.out.printf("%.2f,%.2f\n", area, volume);
        }
    }
}
