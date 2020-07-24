package 线程同步机制.静态同步方法;

public class RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private  static int ticket=100;

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环让卖票操作重复执行
        //先判断票是否存在
        while(true){
            payTicket();
        }

    }

    /*
    定义一个静态同步方法
    锁对象是谁？
    不能是this
    this是创建对象之后产生的，静态方法优先于对象
    静态方法的锁对象是本类的class属性
     */
    public static /*synchronized*/ void payTicket(){
        synchronized (RunnableImpl.class){
            if(ticket>0){
                //票存在，卖票 ticket--
                //程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+"->"+"正在卖第"+ticket+"张票");
                ticket--;
            }

        }



    }



}

