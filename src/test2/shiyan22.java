package test2;
//InheritTest.java 使用继承方式实现目标
//class Animal{
//    private void beat(){
//        System.out.println("心脏跳动...");
//    }
//    public void breath(){
//        beat();
//        System.out.println("吸一口气，呼一口气，呼吸中...");
//    }
//}
////继承Animal，直接复用父类的breath()方法
//class Bird extends Animal{
//    //创建子类独有的方法fly()
//    public void fly(){
//        System.out.println("我是鸟，我在天空中自由的飞翔...");
//    }
//}
////继承Animal，直接复用父类的breath()方法
//class Wolf extends Animal{
//    //创建子类独有的方法run()
//    public void run(){
//        System.out.println("我是狼，我在草原上快速奔跑...");
//    }
//}
//public class shiyan22{
//    public static void main(String[] args){
//        //创建继承自Animal的Bird对象新实例b
//        Bird b=new Bird();
//        //新对象实例b可以breath()
//        b.breath();
//        //新对象实例b可以fly()
//        b.fly();
//        Wolf w=new Wolf();
//        w.breath();
//        w.run();
//
//    }
//}
//CompositeTest.java  使用组合方式实现目标
class Animal{
    private void beat(){
        System.out.println("心脏跳动...");
    }
    public void breath(){
        beat();
        System.out.println("吸一口气，呼一口气，呼吸中...");
    }
}
class Bird{
    //定义一个Animal成员变量，以供组合之用
    private Animal a;
    //使用构造函数初始化成员变量
    public Bird(Animal a){
        this.a=a;
    }
    //通过调用成员变量的固有方法（a.breath()）使新类具有相同的功能（breath()）
    public void breath(){
        a.breath();
    }
    //为新类增加新的方法
    public void fly(){
        System.out.println("我是鸟，我在天空中自由的飞翔...");
    }
}
class Wolf{
    private Animal a;
    public Wolf(Animal a){
        this.a=a;
    }
    public void breath(){
        a.breath();
    }
    public void run(){
        System.out.println("我是狼，我在草原上快速奔跑...");
    }
}
public class shiyan22{
    public static void main(String[] args){
        //显式创建被组合的对象实例a1
        Animal a1=new Animal();
        //以a1为基础组合出新对象实例b
        Bird b=new Bird(a1);
        //新对象实例b可以breath()
        b.breath();
        //新对象实例b可以fly()
        b.fly();
        Animal a2=new Animal();
        Wolf w=new Wolf(a2);
        w.breath();
        w.run();

    }
}