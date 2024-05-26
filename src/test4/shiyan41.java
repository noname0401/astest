package test4;
import java.util.LinkedList;
//class Product {
//    private int id;
//
//    public Product(int id) {
//        this.id = id;
//    }
//    public int getId() {
//        return id;
//    }
//}
//class Producer implements Runnable {
//    private Buffer buffer;
//    private String name;
//    public Producer(Buffer buffer, String name) {
//        this.buffer = buffer;
//        this.name = name;
//    }
//    @Override
//    public void run() {
//        while (true) {
//            try {
//                Thread.sleep((long)(Math.random()*1000));
//                Product product = new Product((int)(Math.random()*4)+1);
//                buffer.produce(product, name);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class Consumer implements Runnable {
//    private Buffer buffer;
//    private String name;
//    public Consumer(Buffer buffer, String name) {
//        this.buffer = buffer;
//        this.name = name;
//    }
//    @Override
//    public void run() {
//        while (true) {
//            try {
//                Thread.sleep((long)(Math.random()*1000));
//                buffer.consume(name);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class Buffer {
//    private int x=0;
//    private static final int MAX_SIZE = 4;
//    public synchronized void produce(Product product, String name) throws InterruptedException {
//        int a= product.getId();
//        while (x+a>=MAX_SIZE){
//            System.out.println(name+"等待放产品");
//            wait();
//        }
//        x+=a;
//        System.out.println(name + "放" + a + "个产品");
//        notifyAll();
//    }
//    public synchronized void consume(String name) throws InterruptedException {
//        while (x <= 0) {
//            System.out.println(name + "等待取产品");
//            wait();
//        }
//        x-=1;
//        System.out.println(name + "取产品使用");
//        notifyAll();
//    }
//}
//public class shiyan41 {
//    public static void main(String[] args) {
//        Buffer buffer = new Buffer();
//        Producer pA = new Producer(buffer, "生产者A");
//        Producer pB = new Producer(buffer, "生产者B");
//        Consumer c1 = new Consumer(buffer, "消费者1");
//        Consumer c2 = new Consumer(buffer, "消费者2");
//        Consumer c3 = new Consumer(buffer, "消费者3");
//        Thread threadPA = new Thread(pA);
//        Thread threadPB = new Thread(pB);
//        Thread threadC1 = new Thread(c1);
//        Thread threadC2 = new Thread(c2);
//        Thread threadC3 = new Thread(c3);
//        threadPA.start();
//        threadPB.start();
//        threadC1.start();
//        threadC2.start();
//        threadC3.start();
//    }
//}
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class shiyan41 {
//
//   // public static final int MAX_QUEUE_SIZE = 4; // 缓冲区最大值
//
//    public static void main(String[] args) {
//        Queue<Product> queue = new LinkedList<>(); // 创建共享缓冲区
//        Producer producerA = new Producer("A", queue); // 创建生产者 A
//        Producer producerB = new Producer("B", queue); // 创建生产者 B
//        Consumer consumer1 = new Consumer("1", queue); // 创建消费者 1
//        Consumer consumer2 = new Consumer("2", queue); // 创建消费者 2
//        Consumer consumer3 = new Consumer("3", queue); // 创建消费者 3
//
//        producerA.start(); // 启动生产者 A
//        producerB.start(); // 启动生产者 B
//        consumer1.start(); // 启动消费者 1
//        consumer2.start(); // 启动消费者 2
//        consumer3.start(); // 启动消费者 3
//    }
//}
//
//class Product {
//
//    private final String name;
//
//    public Product(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Producer extends Thread {
//
//    private final String name;
//    private final Queue<Product> queue;
//
//    public Producer(String name, Queue<Product> queue) {
//        this.name = name;
//        this.queue = queue;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= 4; i++) {
//            synchronized (queue) { // 获取队列锁
//                while (queue.size() >= 4) { // 如果队列已满，等待
//                    try {
//                        queue.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                Product product = new Product(name + "-" + i); // 生产产品
//                queue.offer(product); // 将产品添加到队列末尾
//                System.out.println("生产者" + name + "生产了" + product.getName());
//                queue.notifyAll(); // 通知其他线程
//            }
//        }
//    }
//}
//
//class Consumer extends Thread {
//
//    private final String name;
//    private final Queue<Product> queue;
//
//    public Consumer(String name, Queue<Product> queue) {
//        this.name = name;
//        this.queue = queue;
//    }
//
//    @Override
//    public void run() {
//        while (true) {
//            synchronized (queue) { // 获取队列锁
//                while (queue.isEmpty()) { // 如果队列为空，等待
//                    try {
//                        queue.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                Product product = queue.poll(); // 取出队列头部的产品
//                System.out.println("消费者" + name + "消费了" + product.getName());
//                queue.notifyAll(); // 通知其他线程
//            }
//            try {
//                Thread.sleep(1000); // 每秒钟消费一个产品
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//-------------------------------------------------
import java.util.LinkedList;
import java.util.Random;

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Producer implements Runnable {
    private LinkedList<Product> buffer;
    private String name;

    public Producer(LinkedList<Product> buffer, String name) {
        this.buffer = buffer;
        this.name = name;
    }

    @Override
    public void run() {
        // for (int i = 1; i <= 5; i++) {
        synchronized (buffer) {
            while (true) {
                while (buffer.size() == 4) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted!");
                    }
                }
                Random random = new Random();
                int num = random.nextInt(4) + 1;
                if (buffer.size() >= 4) {
                    System.out.println(name + "等待放产品");
                } else if (buffer.size() + num <= 4) {

                    for (int j = 0; j < num; j++) {
                        Product product = new Product(name);
                        buffer.add(product);
                    }
                    System.out.println("生产者 " + name + " 放" + num + "个产品 " + ", 缓冲区剩余 " + buffer.size());
                    buffer.notifyAll();
                }

            }
            // }
        }
    }
}
class Consumer implements Runnable {
    private LinkedList<Product> buffer;
    private String name;

    public Consumer(LinkedList<Product> buffer, String name) {
        this.buffer = buffer;
        this.name = name;
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    System.out.println(name + "等待取产品");
                    try {
                        buffer.wait();

                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted!");
                    }
                }
                Product product = buffer.remove();
                System.out.println("消费者 " + name + " 取产品使用 " + ", 缓冲区剩余: " + buffer.size());
                buffer.notifyAll();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class shiyan41 {
    public static void main(String[] args) {
        LinkedList<Product> buffer = new LinkedList<Product>();

        Producer producerA = new Producer(buffer, "A");
        Producer producerB = new Producer(buffer, "B");
        Consumer consumer1 = new Consumer(buffer, "1");
        Consumer consumer2 = new Consumer(buffer, "2");
        Consumer consumer3 = new Consumer(buffer, "3");

        Thread threadProducerA = new Thread(producerA);
        Thread threadProducerB = new Thread(producerB);
        Thread threadConsumer1 = new Thread(consumer1);
        Thread threadConsumer2 = new Thread(consumer2);
        Thread threadConsumer3 = new Thread(consumer3);

        threadProducerA.start();
        threadProducerB.start();
        threadConsumer1.start();
        threadConsumer2.start();
        threadConsumer3.start();
    }
}

//import java.util.LinkedList;
//import java.util.Queue;
//
//public class shiyan41 {
//    public static void main(String[] args) {
//        Buffer buffer = new Buffer();
//        Producer producerA = new Producer('A', buffer);
//        Producer producerB = new Producer('B', buffer);
//        Consumer consumer1 = new Consumer(1, buffer);
//        Consumer consumer2 = new Consumer(2, buffer);
//        Consumer consumer3 = new Consumer(3, buffer);
//
//        producerA.start();
//        producerB.start();
//        consumer1.start();
//        consumer2.start();
//        consumer3.start();
//    }
//}
//
//class Buffer {
//    private final Queue<Integer> products = new LinkedList<>();
//    public synchronized void put(Integer product) {
//        while (products.size() >= 4) { // 缓冲区满，等待消费者消费产品
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        products.offer(product);
//        notifyAll(); // 通知消费者有新产品可供消费
//    }
//    public synchronized Integer get() {
//        while (products.isEmpty()) { // 缓冲区空，等待生产者生产产品
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        Integer product = products.poll();
//        notifyAll(); // 通知生产者有空间可以生产
//        return product;
//    }
//}
//
//class Producer extends Thread {
//    private final char id;
//    private final Buffer buffer;
//    public Producer(char id, Buffer buffer) {
//        this.id = id;
//        this.buffer = buffer;
//    }
//    @Override
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            int product = id+ i; // 生成产品
//            buffer.put(product); // 将产品放入缓冲区
//            System.out.println("生产者 " + id + " 生产了产品 " + product);
//            try {
//                sleep(500); // 生产一个产品后休眠 500ms
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class Consumer extends Thread {
//    private final int id;
//    private final Buffer buffer;
//
//    public Consumer(int id, Buffer buffer) {
//        this.id = id;
//        this.buffer = buffer;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            int product = buffer.get(); // 从缓冲区取出一个产品
//            System.out.println("消费者 " + id + " 消费了产品 " + product);
//            try {
//                sleep(500); // 消费一个产品后休眠 500ms
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
