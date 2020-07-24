package 线程实现方式.Thread类的常用方法_获取线程名称;
/*
    获取线程的名称：
        1.使用Thread类中的方法getName()
            String getName()返回该线程的名称
        2.可以先获取到当前正在执行的线程，使用线程中的方法getName（）获取线程的名称
            static Thread类的常用方法_sleep currentThread() 返回当前正在执行的线程对象的引用

    线程的名称：
        主线程：main
        新线程：Thread类的常用方法_sleep-0,Thread类的常用方法_sleep-1..
 */

public class DemoGetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt=new MyThread();
        mt.start();



        //获取主线程的名称
        System.out.println(Thread.currentThread().getName());

    }
}
