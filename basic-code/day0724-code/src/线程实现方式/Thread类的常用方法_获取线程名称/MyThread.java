package 线程实现方式.Thread类的常用方法_获取线程名称;

//定义一个Thread类的子类
public class MyThread extends Thread {
    @Override
    public void run() {
        //获取线程名称
        //第一种方法
        //String name = getName();
        //System.out.println(name);

        //第二种方法
        //Thread类的常用方法_sleep thread = Thread类的常用方法_sleep.currentThread();
        //System.out.println(thread);
        //String name = thread.getName();
        //System.out.println(name);

        System.out.println(Thread.currentThread().getName());//链式编程
    }
}
