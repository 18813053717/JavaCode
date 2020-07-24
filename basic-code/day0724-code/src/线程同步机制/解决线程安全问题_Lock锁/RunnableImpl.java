package 线程同步机制.解决线程安全问题_Lock锁;
/*
    实现卖票案例

    解决线程安全问题的第三种方案：使用Lock锁
    java.util.concurrent,locks,lock接口
    lock接口中的方法：
        void lock（）：获取锁
        void unlock（）：释放锁
    java.util.concurrent.locks.Reentrantlock implements lock接口


    使用步骤：
        1.在成员位置创建一个Reentrantlock 对象
        2.在可能出现安全问题的代码前调用lock接口中的方法lock获取锁
        3.在可能出现安全问题的代码后调用lock接口中的方法unlock释放锁
    格式：

    public synchronized void method(){
        可能产生线程安全问题的代码
    }
 */


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private  int ticket=100;

    //在成员位置创建一个Reentrantlock 对象
    Lock lock=new ReentrantLock();


    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环让卖票操作重复执行
        //先判断票是否存在
        while(true){
            lock.lock();
            if(ticket>0){
                //票存在，卖票 ticket--
                //程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println(Thread.currentThread().getName()+"->"+"正在卖第"+ticket+"张票");
                    ticket--;
                    lock.unlock();//无论程序是否异常都会把锁释放
                }
            }
        }
    }
}
