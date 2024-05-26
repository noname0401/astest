package test4;
public class shiyan45 {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher(student);
        student.start();
        teacher.start();
    }
}
class Student extends Thread {
    @Override
    public void run() {
        System.out.println("张三在睡觉不上课");
        try {
            Thread.sleep((long) 10*1000);
        } catch (InterruptedException e) {
//					e.printStackTrace();
            System.out.println("张三被叫醒了");
            System.out.println("张三开始上课");
        }
    }
}
class Teacher extends Thread {
    private final Student student;
    public Teacher(Student student) {
        this.student = student;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("老师：上课");
        }
        student.interrupt(); // 老师唤醒休眠的学生
    }
}
//public class shiyan45 {
//    public static void main(String[] args) {
//        Student student = new Student();
//        Teacher teacher = new Teacher(student);
//
//        student.start();
//        teacher.start();
//    }
//}
//
//class Student extends Thread {
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(3600000); // 休眠 1 小时（单位：毫秒）
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("学生：好困啊，我终于可以开始上课了！");
//    }
//}
//
//class Teacher extends Thread {
//    private Student student;
//
//    public Teacher(Student student) {
//        this.student = student;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("老师：上课！");
//        }
//
//        synchronized (student) { // 用 synchronize 实现线程间的通信
//            student.notify(); // 唤醒休眠的线程
//        }
//    }
//}

//public class shiyan45 {
//
//    static Thread student1,  teacher;
//
//    public static void main(String[] args) {
//        student1 = new Thread() {
//            @Override
//            public void run() {
//                super.run();
//                System.out.println("张三在睡觉，不上课");
//                try {
//                    Thread.sleep((long) 10*1000);
//
//                } catch (InterruptedException e) {
////					e.printStackTrace();
//                    System.out.println("张三被叫醒了");
//                    System.out.println("张三开始上课");
//                }
//            }
//        };
//
//
//        teacher = new Thread() {
//            @Override
//            public void run() {
//                super.run();
//
//                System.out.println("上课");
//                System.out.println("上课");
//                System.out.println("上课");
//                student1.interrupt();		//吵醒学生1
//            }
//        };
//        teacher.start();
//        student1.start();
//
//
//    }
//
//}
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class shiyan45 {
//    Thread student,teacher;
//    public static void main(String args[]) {
//        Thread t  = new Student();
//        Thread tt  = new Teacher();
//        t.student.start();
//        t.teacher.start();
//    }
//}
////    void ThreadDemo(){
////        teacher = new Teacher();
////        student = new Student();
////    }
//class Student extends Thread {
//
//    public void run() {
//        try {
//            System.out.println("学生张三正在睡觉！不听课");
//            this.sleep(1000 * 60 * 60);
//        } catch (InterruptedException ex) {
//            System.out.println("学生张三醒了！");
//            System.out.println("学生张三起来听课了！");
//        }
//    }
//}
//class Teacher extends Thread {
//
//    public void run() {
//        try {
//            for (int i = 0; i < 3; i++) {
//                System.out.println("上课！");
//                this.sleep(500);
//            }
//            student.interrupt();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
//public class shiyan45 {
//    public static void main(String[] args) {
//
//        InterruptSleep task = new InterruptSleep();// 创建线程的任务类对象
//       // 创建线程并起名为窗口1， 开启线程
//        task.teacher.start();
//        task.student1.start();
//        task.student2.start();
//    }
//}
//class InterruptSleep implements Runnable
//{
//
//    Thread student1,student2,teacher;
//    InterruptSleep()
//    {
//        teacher=new Thread(this);
//        student1=new Thread(this);
//        student2=new Thread(this);
//    }
//    public void run()
//    {
//        if(Thread.currentThread()==student2)
//        {
//            try{
//                System.out.println("student2 要睡一小时再听课,现在不听课"); Thread.sleep(1000*60*60);
//            }
//            catch(InterruptedException e)
//            {
//                System.out.println("student2 还没睡够呢,但是被 student1 给叫醒了");
//            }
//            System.out.println("student2 开始上课");
//        }
//        else if(Thread.currentThread()==student1)
//        {
//            try {
//                System.out.println("student1 要睡 10 分钟再上课,现在不听课");
//                Thread.sleep(1000*60*10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
