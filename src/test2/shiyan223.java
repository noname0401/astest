package test2;

class Trangle
{
    double sideA,sideB,sideC,area,length;
    boolean boo;
    public Trangle(double a,double b,double c)
    {
        this.sideA=a;
        this.sideB=b;
        this.sideC=c;
  //参数 a,b,c 分别赋值给 sideA,sideB,sideC
        if(a+b>c&&a+c>b&&b+c>a) //a,b,c 构成三角形的条件表达式
        {
        boo=true;
 //给 boo 赋值。
        }
 else
        {
        boo=false; //给 boo 赋值。
        }
    }
    double getLength()
    {
        length=sideA+sideB+sideC;
       return length;
  //方法体，要求计算出 length 的值并返回
    }
    public double getArea()
    {
        if(boo)
        {
            double p=(sideA+sideB+sideC)/2.0;
            area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
            return area;
        }
        else
        {
            System.out.println("不是一个三角形,不能计算面积");
            return 0;
        }
    }
    public void setABC(double a,double b,double c)
    {
        this.sideA=a;
        this.sideB=b;
        this.sideC=c;
        //参数 a,b,c 分别赋值给 sideA,sideB,sideC
        if(a+b>c&&a+c>b&&b+c>a) //a,b,c 构成三角形的条件表达式
        {
            boo=true;
            //给 boo 赋值。
        }
        else
        {
            boo=false; //给 boo 赋值。
        }
    }
}
class Lader
{
    double above,bottom,height,area;
    Lader(double a,double b,double h)
    {
        this.above=a;
        this.bottom=b;
        this.height=h;
 //方法体，将参数 a,b,c 分别赋值给 above,bottom,height
    }
    double getArea()
    {
        area=((above+bottom)*height)/2;
        return area;
  //方法体，,要求计算出 area 返回
    }
}
class Circle
{
    double radius,area;
    Circle(double r)
    {
       this.radius=r;
        //方法体
    }
    double getArea()
    {
        area=3.14*radius*radius;
        return area;//方法体，要求计算出 area 返回
    }
    double getLength()
    {
        return 3.14*2*radius;
        //getArea 方法体的代码,要求计算出 length 返回
    }
    void setRadius(double newRadius)
    {
        radius=newRadius;
    }
    double getRadius()
    {
        return radius;
    }
}
public class shiyan223
{
    public static void main(String args[])
    {
        double length,area;
        //Circle circle=null;
        //Trangle trangle;
        //Lader lader;
        Circle circle=new Circle(5.5);
        Trangle trangle=new Trangle(1,1 ,2);
        Lader lader=new Lader(1,2,5);
  //创建对象 circle
  //创建对象 trangle。
  //创建对象 lader

 // circle 调用方法返回周长并赋值给 length

        length=circle.getLength();
        System.out.println("圆的周长:"+length);
 area= circle.getArea(); // circle 调用方法返回面积并赋值给 area
        System.out.println("圆的面积:"+area);

        length=trangle.getLength(); // trangle 调用方法返回周长并赋值给 length
        System.out.println("三角形的周长:"+length);
        area= trangle.getArea();
 // trangle 调用方法返回面积并赋值给 area
        System.out.println("三角形的面积:"+area);

        area= lader.getArea();
 // lader 调用方法返回面积并赋值给 area
        System.out.println("梯形的面积:"+area);

        trangle.setABC(12,34,1);// trangle 调用方法设置三个边，要求将三个边修改为 12,34,1。

        area= trangle.getArea();
  // trangle 调用方法返回面积并赋值给 area
        System.out.println("三角形的面积:"+area);
        length= trangle.getLength();
  // trangle 调用方法返回周长并赋值给 length
        System.out.println("三角形的周长:"+length);
    }
}
