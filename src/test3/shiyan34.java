package test3;
//形状类
abstract class Shape{
    public abstract double area();//面积
    public abstract double perimeter();//周长
    public abstract String setColor(String color);//设置颜色
}
//矩形类
class Circle extends Shape{
    private double r;
    private String color;

    public Circle(double r) {
        this.r = r;

    }

    @Override
    public double area() {
        return 3.14*r*r;
    }

    @Override
    public double perimeter() {
        return 2*3.14*r;
    }

    public String setColor(String color){
        this.color=color;
        return color;
    }
}
//三角形类
class Triangle extends Shape{
    private int a,b,c;
    private String color;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    public String setColor(String color){
        this.color=color;
        return color;
    }
}

public class shiyan34 {
    public static void main(String[] args) {
        Circle Circle = new Circle(2);
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("圆形的颜色为："+Circle.setColor("blue"));
        System.out.println("圆形的面积为："+Circle.area());
        System.out.println("圆形的周长为："+Circle.perimeter());
        System.out.println("三角的颜色为："+triangle.setColor("yellow"));
        System.out.println("三角形的面积为："+triangle.area());
        System.out.println("三角形的周长为："+triangle.perimeter());
    }

}
