package 线程实现方式.创建多线程程序的第一种方式_创建Thread子类的实例;
/*
    java.lang.Thread类是面向线程的类，想要实现多线程程序，就必须继承Thread类

    创建多线程程序的第一种方式：创建Thread类的子类

    实现步骤：
        1.创建一个Thread类的子类
        2.在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么）
        3.创建Thread类的子类对象
        4.调用Thread类中的start方法（开辟新的栈空间），开启新的线程，执行run方法
    java程序属于抢占式调度，哪个线程的优先级高，哪个线程就优先执行，同一优先级就随机选择一个,程序执行的结果：随机打印
 */

public class DemoMultiThread1 {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread thread=new MyThread();
        //调用start方法
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }
    }
}
