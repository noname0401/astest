package test3;

//import java.util.Scanner;
//
//public class shiyan35 {
//    public static void main(String[] args) {
//        ComputerWeight[] goods=new ComputerWeight[650]; //650件货物
//        double[] a=new double[3];//存储Television,Computer,WashMachine对象weight属性初值
//        Scanner sc=new Scanner(System.in);
//        String str1=sc.nextLine();
//        String[] str_a=str1.split(" ");
//        for(int i=0;i<3;i++)
//            a[i]=Double.parseDouble(str_a[i]);
//        for(int i=0;i<goods.length;i++) { //简单分成三类
//            if(i%3==0)
//                goods[i]=new Television(a[0]);
//            else if(i%3==1)
//                goods[i]=new Computer(a[1]);
//            else if(i%3==2)
//                goods[i]=new WashMachine(a[2]);
//        }
//        Truck truck=new Truck(goods);
//        System.out.printf("货车装载的货物重量:%-8.5f kg\n",truck.getTotalWeights());
//        goods=new ComputerWeight[68]; //68件货物
//        for(int i=0;i<goods.length;i++) { //简单分成两类
//            if(i%2==0)
//                goods[i]=new Television(a[0]);
//            else
//                goods[i]=new WashMachine(a[2]);
//        }
//        truck.setGoods(goods);
//        System.out.printf("货车装载的货物重量:%-8.5f kg\n",truck.getTotalWeights());
//    }
//}
//interface ComputerWeight
//{
//    double computerWeight();
//}
//
//class Truck
//{
//    ComputerWeight[] goods = new ComputerWeight[650];
//
//    Truck(ComputerWeight[] goods) {
//        super();
//        this.goods = goods;
//    }
//
//    public void setGoods(ComputerWeight[] goods) {
//        this.goods = goods;
//    }
//
//    public double getTotalWeights()
//    {
//        double sum=0;
//        for(int i=0;i<goods.length;i++)
//        {
//            sum += goods[i].computerWeight();
//        }
//        return sum;
//    }
//
//}
//
//class Television implements ComputerWeight
//{
//    double weight;
//
//    Television(double weight) {
//        super();
//        this.weight = weight;
//    }
//    @Override
//    public double computerWeight()
//    {
//        return weight;
//    }
//}
//
//class Computer implements ComputerWeight
//{
//    double weight;
//    Computer(double weight)
//    {
//        this.weight=weight;
//    }
//    @Override
//    public double computerWeight()
//    {
//        return 2*weight;
//    }
//}
//
//
//class WashMachine implements ComputerWeight
//{
//    double weight;
//    WashMachine(double weight)
//    {
//        this.weight=weight;
//    }
//    @Override
//    public double computerWeight()
//    {
//        return 3*weight;
//    }
//}
interface ComputerWeight
{
     public double computerWeight();
}
class Television implements ComputerWeight
{
    double weight;
    Television(double weight) {
        this.weight = weight;
    }
    public double computerWeight()
    {
        return weight;
    }

}
class Computer implements ComputerWeight
{
    double weight;
    Computer(double weight)
    {
        this.weight=weight;
    }
    public double computerWeight()
    {
        return 2*weight;
    }

}
class WashMachine implements ComputerWeight
{
    double weight;
    WashMachine(double weight)
    {
        this.weight=weight;
    }

    public double computerWeight()
    {
        return 3*weight;
    }

}
class Truck
{
    ComputerWeight[] goods;
    double totalWeights=0;
    Truck(ComputerWeight[] goods)
    {
        this.goods=goods;
    }
    public void setGoods(ComputerWeight[] goods){
        this.goods=goods;
    }
    public double getTotalWeights()
    {
        totalWeights=0;
        for(int i=0;i<goods.length;i++){
            totalWeights+=goods[i].computerWeight();
        }
  //计算 totalWeights
        return totalWeights;
    }
}
public class shiyan35
{
    public static void main(String args[])
    { ComputerWeight[] goods=new ComputerWeight[650];//650 件货物
      //  ComputerWeight[] goodstwo=new ComputerWeight[22];
        for(int i=0;i<goods.length;i++)
        { //简单分成三类
            if(i%3==0)
                goods[i]=new Television(1);
            else if(i%3==1)
                goods[i]=new Computer(1);
            else if(i%3==2)
                goods[i]=new WashMachine(1);
        }
        Truck truck=new Truck(goods);
        System.out.printf("\n 货车装载的货物重量：%-8.5fkg\n",truck.getTotalWeights());
        goods=new ComputerWeight[68];//68 件货物
        for(int i=0;i<goods.length;i++)
        { //简单分成两类
            if(i%2==0)
                goods[i]=new Television(1);
            else
                goods[i]=new WashMachine(1);
        }
        truck.setGoods(goods);
        System.out.printf("\n 货车装载的货物重量：%-8.5fkg\n",truck.getTotalWeights());
    }
}