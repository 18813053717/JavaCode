package 线程同步机制.解决线程安全问题_同步代码块;
/*
    解决线程安全问题的第一种方案：使用同步代码块
    格式：
        synchronized(锁对象){
            可能出现线程安全问题的代码（访问了共享数据的代码）
        }
    注意：
        1.同步代码块中的锁对象，可以使用任意的对象
        2.但是必须保证多个线程使用的锁对象是同一个
        3.锁对象作用：
            把同步代码块锁住，只让一个线程在同步代码块中执行
 */

public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private  int ticket=100;

    //创建一个锁对象
    Object object=new Object();

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环让卖票操作重复执行
        //先判断票是否存在
        while(true){
            //同步代码块
            synchronized (object){
                if(ticket>0){
                    //票存在，卖票 ticket--
                    System.out.println(Thread.currentThread().getName()+"->"+"正在卖第"+ticket+"张票");
                    ticket--;
                }

            }


        }

    }


}
