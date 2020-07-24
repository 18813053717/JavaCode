package 线程同步机制.解决线程安全问题_同步方法;
/*
    实现卖票案例

    解决线程安全问题的第二种方案：使用同步方法
    使用步骤：
        1.把访问了共享数据的代码抽取出来，放到一个方法中
        2.在方法上添加synchronized修饰符
    格式：

    public synchronized void method(){
        可能产生线程安全问题的代码
    }
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
            payTicket();
        }

    }

    /*
    定义一个同步方法
     */
    public synchronized void payTicket(){
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
