package test4;

import java.util.Random;
public class shiyan43 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王二";
        PhoneReceiver receiver = new PhoneReceiver();
        for (int i = 0; i <= 2; i++) {
            PhoneCall call = new PhoneCall(names[i], receiver);
            call.start();
        }
    }
}
class PhoneCall extends Thread {
    private  String name;
    private final PhoneReceiver receiver;
    public PhoneCall(String name, PhoneReceiver receiver) {
        this.name = name;
        this.receiver = receiver;
    }
    @Override
    public void run() {
        Random random = new Random();
        int seconds = 10 + random.nextInt(21); // 生成10到30之间随机数
        try {
            Thread.sleep(seconds * 10); // 将秒转换为毫秒，休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        receiver.answerCall(name); // 电话接通后通知接听者
    }
}
class PhoneReceiver {
    public synchronized void answerCall(String name) {
        System.out.println("我正在接听"+name+"电话,他在和我交谈。。。");
        System.out.println("我接完"+name+"电话");
    }
}
//import java.util.Random;
//
// class PhoneReceiver extends Thread {
//    private int phoneNum;
//    private Random rand = new Random();
//
//    public PhoneReceiver(int phoneNum) {
//        this.phoneNum = phoneNum;
//    }
//
//    public void run() {
//        System.out.println("Phone " + phoneNum + " is ringing...");
//        int callDuration = 10 + rand.nextInt(21); // 随机生成10至30秒之间的通话时间
//        try {
//            Thread.sleep(callDuration * 10); // 将通话时间转换为毫秒并将线程挂起
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Phone " + phoneNum + " finished the call after " + callDuration + " seconds.");
//    }
//
//    public static void main(String[] args) {
//        // 创建三个电话接听者实例并启动线程
//        PhoneReceiver receiver1 = new PhoneReceiver(1);
//        PhoneReceiver receiver2 = new PhoneReceiver(2);
//        PhoneReceiver receiver3 = new PhoneReceiver(3);
//        receiver1.start();
//        receiver2.start();
//        receiver3.start();
//    }
//}

