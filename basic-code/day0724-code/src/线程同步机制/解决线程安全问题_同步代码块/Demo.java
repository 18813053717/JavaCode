package 线程同步机制.解决线程安全问题_同步代码块;

public class Demo {
    public static void main(String[] args) {
        RunnableImpl runnable=new RunnableImpl();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
    }
}
