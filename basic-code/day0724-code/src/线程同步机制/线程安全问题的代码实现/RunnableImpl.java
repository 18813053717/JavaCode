package 线程同步机制.线程安全问题的代码实现;
/*
    实现卖票案例
 */


public class RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private  int ticket=100;

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环让卖票操作重复执行
        //先判断票是否存在
        while(true){
            if(ticket>0){
                //票存在，卖票 ticket--
                System.out.println(Thread.currentThread().getName()+"->"+"正在卖第"+ticket+"张票");
                ticket--;


            }
            if(ticket==0){
                return;
            }
        }

    }



}
