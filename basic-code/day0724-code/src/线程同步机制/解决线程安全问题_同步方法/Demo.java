package 线程同步机制.解决线程安全问题_同步方法;
/*
    同步方法：使用synchronized修饰的方法叫做同步方法，保证A线程执行该方法的时候，其他线程只能在方法外等着
    格式：
    public synchronized void method(){
        可能产生线程安全问题的代码
    }
 */

public class Demo {
    public static void main(String[] args) {
        RunnableImpl run=new RunnableImpl();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();

    }
}
