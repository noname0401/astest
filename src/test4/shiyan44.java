package test4;
class TicketSeller implements Runnable {
    private int ticketCount = 10;
    @Override
    public void run() {
        while (ticketCount > 0) {
            try {
                Thread.sleep(10); // 售票线程休眠一段时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) { // 使用 synchronized 同步代码块
                if (ticketCount <= 0) {
                    break; // 票已经售完，退出循环
                }
                System.out.println(Thread.currentThread().getName() + "卖出的票：" + ticketCount  );
                ticketCount--;
            }
        }
    }
}
public class shiyan44 {
    public static void main(String[] args) {
        TicketSeller seller = new TicketSeller();

        new Thread(seller, "窗口1").start();
        new Thread(seller, "窗口2").start();
        new Thread(seller, "窗口3").start();
        new Thread(seller, "窗口4").start();
    }
}


//public class shiyan44 {
//    public static void main(String[] args) {
//        TicketWindow task = new TicketWindow();// 创建线程的任务类对象
//        new Thread(task, "窗口1").start();// 创建线程并起名为窗口1， 开启线程
//        new Thread(task, "窗口2").start();// 创建线程并起名为窗口2， 开启线程
//        new Thread(task, "窗口3").start();// 创建线程并起名为窗口3， 开启线程
//        new Thread(task, "窗口4").start();// 创建线程并起名为窗口4， 开启线程
//    }
//}
//
//// 线程的任务类
//class TicketWindow implements Runnable {
//    private int tickets = 10; // 10张票
//    Object lock = new Object();// 定义任意一个对象，用作同步代码块的锁
//
//    @Override
//    public void run() {
//        while (true) {
//            synchronized (lock) { // 定义同步代码块
//                try {
//                    Thread.sleep(500);// 线程休眠10毫秒
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                if (tickets > 0) {
//                    System.out.println(Thread.currentThread().getName()
//                            + "---卖出的票" + tickets--);
//                } else {
//                    break;
//                }
//            }
//        }
//        //
//    }
//}





/**
 * 同步方法
 */
//public class shiyan44 {
//    public static void main(String[] args) {
//        TicketWindow task = new TicketWindow();// 创建线程的任务类对象
//        new Thread(task, "窗口1").start();// 创建线程并起名为窗口1， 开启线程
//        new Thread(task, "窗口2").start();// 创建线程并起名为窗口2， 开启线程
//        new Thread(task, "窗口3").start();// 创建线程并起名为窗口3， 开启线程
//        new Thread(task, "窗口4").start();// 创建线程并起名为窗口4， 开启线程
//    }
//}
//// 线程的任务类
//class TicketWindow implements Runnable {
//    private int tickets = 10; // 10张票
//
//    @Override
//    public void run() {
//        while (true) {
//            sendTicket();
//        }
//    }
//    // 定义售票的方法
//    public synchronized void sendTicket() {
//        try {
//            Thread.sleep(500);// 线程休眠10毫秒
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        if (tickets > 0) {
//            System.out.println(Thread.currentThread().getName() + "---卖出的票"
//                    + tickets--);
//        } else {
//            System.exit(0);
//        }
//    }
//}



//public class shiyan44 {
//    public static void main(String[] args) {
//        //创建TicketWindow对象
//        TicketWindow tw = new TicketWindow();
//
//        //创建线程对象
//        new Thread(tw, "窗口一").start();
//        new Thread(tw, "窗口二").start();
//        new Thread(tw, "窗口三").start();
//        new Thread(tw, "窗口四").start();
//    }
//}
//
//class TicketWindow implements Runnable {
//
//    //定义一个成员变量，这个成员变量记录的就是要出售的票的总数
//    private int tickets = 10;
//
//    @Override
//    public void run() {
//        while (tickets > 0) {
//            try {
//                Thread.sleep(10);// 线程休眠10毫秒
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "---卖出的票"
//                    + tickets--);
//        }
//    }
//}




//窗口4---卖出的票10
//        窗口3---卖出的票9
//        窗口1---卖出的票8
//        窗口2---卖出的票7
//        窗口4---卖出的票6
//        窗口1---卖出的票5
//        窗口3---卖出的票6
//        窗口2---卖出的票4
//        窗口3---卖出的票3
//        窗口4---卖出的票1
//        窗口1---卖出的票3
//        窗口2---卖出的票2