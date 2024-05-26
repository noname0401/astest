package test2;

class People
{ protected double weight,height;
    public void speakHello()
    { System.out.println("yayawawa");
    }
    public void averageHeight()
    { height=173;
        System.out.println("average height:"+height);
    }
    public void averageWeight()
    { weight=70;
        System.out.println("average weight:"+weight);
    }}

class ChinaPeople extends People {
    public void speakHello() {
        System.out.println("你好，吃了吗");
    }

    //重写 public void speakHello()方法，要求输出类似“你好，吃了吗”这样的
//汉语信息
    public void averageHeight() {
        height = 168.78;
        System.out.println("中国人的平均身高：" + height + "厘米");
    }

    //重写 public void averageHeight()方法，要求输出类似
//“中国人的平均身高：168.78 厘米”这样的汉语信息
    public void averageWeight() {
        weight = 65;
        System.out.println("中国人的平均体重：" + weight + "公斤");
    }

    //重写 public void averageWeight()方法，
//要求输出类似“中国人的平均体重：65 公斤”这样的汉语信息
    public void chinaGongfu() {
        System.out.println("中国武术：坐如钟！站如松！睡如弓！");
    }
    //输出中国武术的信息，例如："坐如钟,站如松,睡如弓"等 }}
}
 class AmericanPeople extends People {
    public void speakHello() {
        System.out.println("how do you do");
    }

    //重写 public void speakHello()方法，要求输出类似“你好，吃了吗”这样的
//汉语信息
    public void averageHeight() {
        height = 180.0;
        System.out.println("American average height：" + height + "cm");
    }

    //重写 public void averageHeight()方法，要求输出类似
//“中国人的平均身高：168.78 厘米”这样的汉语信息
    public void averageWeight() {
        weight = 80;
        System.out.println("American average weight：" + weight + "kg");
    }

    //重写 public void averageWeight()方法，
//要求输出类似“中国人的平均体重：65 公斤”这样的汉语信息
    public void americanBoxing() {
        System.out.println("直拳，勾拳");
    }
    //输出中国武术的信息，例如："坐如钟,站如松,睡如弓"等 }}
}
 class BeijingPeople extends ChinaPeople {
    public void speakHello() {
        System.out.println("您好");
    }

    //重写 public void speakHello()方法，要求输出类似“你好，吃了吗”这样的
//汉语信息
    public void averageHeight() {
        height = 170;
        System.out.println("北京人的平均身高：" + height + "厘米");
    }

    //重写 public void averageHeight()方法，要求输出类似
//“中国人的平均身高：168.78 厘米”这样的汉语信息
    public void averageWeight() {
        weight = 75;
        System.out.println("北京人的平均体重：" + weight + "公斤");
    }

    //重写 public void averageWeight()方法，
//要求输出类似“中国人的平均体重：65 公斤”这样的汉语信息
    public void beijingOpera() {
        System.out.println("京剧的信息");
    }
    //输出中国武术的信息，例如："坐如钟,站如松,睡如弓"等 }}
}
public class shiyan24
{
    public static void main(String args[])
    {
        ChinaPeople chinaPeople=new ChinaPeople();
        AmericanPeople americanPeople=new AmericanPeople();
        BeijingPeople beijingPeople=new BeijingPeople();
        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();
        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();
        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageWeight();
        chinaPeople.chinaGongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingOpera() ;
        beijingPeople.chinaGongfu();
    }
}
