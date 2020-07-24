package 线程同步机制.线程安全问题的代码实现;
/*
    模拟卖票案例
    创建3个线程，同时开启，对共享的票进行出售

    注意：
    线程安全问题是不能产生的，我们可以让一个线程在访问共享数据的时候后，无论是否丢失了cpu的执行权，让其他的线程只能等待，等待当前线程卖完票
    其他线程继续卖票，即保证只有一个线程在卖票
 */

public class DemoTest {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象（想要访问共享数据，需要创建一个实现类多个）
        RunnableImpl impl=new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread thread_0 = new Thread(impl);
        Thread thread_1 = new Thread(impl);
        Thread thread_2 = new Thread(impl);
        //调用start方法开启多线程
        thread_0.start();
        thread_1.start();
        thread_2.start();
    }
}
