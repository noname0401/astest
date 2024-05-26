package test3;

import java.util.*;
/*
* 定义抽象的家用电器类，并在此基础上定义具体的家电类（如电视机类、空调类、微波
炉类等），定义父类对象并使其在不同时刻表示子类对象，并使子类对象表示出自身的工作
状态。输出当前时刻电视机类、空调类、微波炉类的工作状态。*/
abstract class equipment {
    String name;
    public abstract String open();
    public abstract String state();
    public abstract String working();
    public abstract String close();

}

class tv extends equipment {
    private  String name;
    public tv(String name){
        this.name=name;
    }
    public String open(){
        //System.out.println("电视已经打开");
        return "电视已经打开";
    }
    public String working(){
        //System.out.println("电视正在放映节目");
        return "电视正在放映节目";
    }
    public  String state(){
       // System.out.println("电视工作太久了需要关闭");
        return "电视工作太久了需要关闭";
    }
    public String close(){
      //  System.out.println("电视正已经关闭");
        return "电视正已经关闭";
    }
    String getname(){
        return name;
    }


}

class kt extends equipment {
    private  String name;
    public kt(String name){
        this.name=name;
    }
    public String open(){
       // System.out.println("空调已经打开");
        return "空调已经打开";
    }
    public String working(){
       // System.out.println("空调正在制冷");
        return "空调正在制冷";
    }
    public  String state(){
       // System.out.println("空调工作太久了需要关闭");
        return "空调工作太久了需要关闭";
    }
    public String close(){
      //  System.out.println("空调正已经关闭");
        return "空调正已经关闭";
    }
    String getname(){
        return name;
    }

}


public class shiyan31 {

    public static void main(String[] args) {
        tv tv1=new tv("Haier");
        kt kt1=new kt("美的");
        System.out.println("电视机\n打开");
        System.out.println(tv1.getname()+tv1.open());
        System.out.println("工作状态");
      //  tv1.working();
        System.out.println(tv1.getname()+tv1.working());
        System.out.println("工作多久了");
      //  tv1.state();
        System.out.println(tv1.getname()+ tv1.state());
        System.out.println("关闭");
      //  tv1.close();
        System.out.println(tv1.getname()+ tv1.close());
        System.out.println("空调\n打开");
       // kt1.open();
        System.out.println(kt1.getname()+ kt1.open());
        System.out.println("工作状态");
       // kt1.working();
        System.out.println(kt1.getname()+  kt1.working());
        System.out.println("工作多久了");
       // kt1.state();
        System.out.println(kt1.getname()+  kt1.state());
        System.out.println("关闭");
      //  kt1.close();
        System.out.println(kt1.getname()+  kt1.close());
    }

}

//class TV {
//    int channel; //电视频道
//    void setChannel (int m){
//        if(m>=1){
//            channel=m;
//        }
//    }
//    int getChannel(){
//        return channel;
//    }
//    void showProgram(){
//        switch(channel){
//            case 1: System.out.println("综合频道");
//                break;
//            case 2: System.out.println("经济频道");
//                break;
//            case 3: System.out.println("文艺频道");break;
//            case 4: System.out.println("国际频道");break;
//            case 5: System.out.println("体育频道");break;
//            default: System.out.println("不能收看"+channel+ "频道");
//
//        }
//    }
//}
//
//class Family {
//    TV homeTV;
//    void buyTV(TV tv){
//        this.homeTV=tv;
//        //将参数tv赋值给homeTV
//    }
//    void remoteControl(int m){
//        homeTV.setChannel(m);
//    }
//    void seeTV(){
//        homeTV.showProgram();//homeTV调用showProgram()方法
//    }
//}
//
//public class shiyan31 {
//    public static void main(String args[]){
//        TV haierTV=new TV();
//        haierTV.setChannel(1);
//        //haierTV调用setChannel(int m),并向参数m传递5
//        System.out.println("haierTV的频道是"+haierTV.getChannel());
//        Family zhangsanFamily=new Family();
//        zhangsanFamily.buyTV(haierTV);
//        //zhangsanFamily调用void buyTV(TV tv)方法，并将haierTV传递给参数TV
//        System.out.println("zhangsanFamily开始看电视节目");
//        zhangsanFamily.seeTV();
//        int m=4;
//        System.out.println("zhangsanFamily将电视更换为"+m+"频道");
//        zhangsanFamily.remoteControl(m);
//        System.out.println("haierTV的频道是"+haierTV.getChannel());
//        System.out.println("zhangsanFamily再看电视节目");
//        zhangsanFamily.seeTV();
//    }
//}