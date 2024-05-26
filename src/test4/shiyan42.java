package test4;

class Tortoise extends Thread {
    int sleepTime = 0;
    int liveLength = 0;
    Tortoise(int sleepTime, String name, int liveLength) {
        this.sleepTime = sleepTime;
        this.liveLength = liveLength;
        // 设置线程的名字 name
        setName(name);
    }
    public void run() {
        while(true) {
            liveLength--;
            System.out.printf("@");
            try {
                // 让线程调用 sleep()方法进入中断状态，sleepTime 毫秒后线程重新排队，等待 CPU 资源
                sleep(sleepTime);
            } catch(InterruptedException e) {
            }
            if(liveLength <= 0) {
                System.out.printf(getName() + "进入死亡状态\n");
                // 结束 run()方法的语句
                return;
            }
        }
    }
}

class Rabbit extends Thread {
    int sleepTime = 0;
    int liveLength;
    Rabbit(int sleepTime, String name, int liveLength) {
        this.sleepTime = sleepTime;
        this.liveLength = liveLength;
        // 设置线程的名字 name
        setName(name);
    }
    public void run() {
        while(true) {
            liveLength--;
            System.out.printf("*");
            try {
                // 让线程调用 sleep()方法进入中断状态,sleepTime 毫秒后线程重新排队，等待 CPU 资源
                sleep(sleepTime);
            } catch(InterruptedException e) {
            }
            if(liveLength <= 0) {
                System.out.printf(getName() + "进入死亡状态\n");
                // 结束 run()方法的语句
                return;
            }
        }
    }
}

public class shiyan42 {
    public static void main(String args[]) {
        Rabbit rabbit;
        // 新建线程 rabbit
        rabbit = new Rabbit(1000, "兔子", 10);
        Tortoise tortoise;
        // 新建线程 tortoise
        tortoise = new Tortoise(500, "乌龟", 30);
        // 启动线程 tortoise
        tortoise.start();
        // 启动线程 rabbit
        rabbit.start();
    }
}
