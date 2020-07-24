package 等待唤醒机制.Object类中的wait带参方法和notifyAll方法;
/*
    进入到TimeWaiting（计时等待）有两种方式
    1.使用sleep(Long m)方法，在ms值结束之后，线程睡醒进入到Runnable/Blocked状态
    2.使用wait（Long m）方法，wait方法如果在ms值结束之后，还没有被notify唤醒，就会自动醒来，线程睡醒进入到Runnable/Blocked状态

    唤醒的方法:
        void notify（）唤醒在此对象监视器上等待的单个线程
        void notifyAll（）唤醒在此对象监视器上等待的所有线程
 */

public class Demo {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj=new Object();
        //创建一个消费者线程：
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要使用同步代码块
                synchronized (obj){
                    System.out.println("顾客1告知老板要的包子的种类和数量");
                    try {
                        obj.wait();
                        //obj.wait(5000);//相当于sleep方法
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("顾客1包子开吃");
                }

            }
        }.start();

        //创建一个消费者线程：
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要使用同步代码块
                synchronized (obj){
                    System.out.println("顾客2告知老板要的包子的种类和数量");
                    try {
                        obj.wait();
                        //obj.wait(5000);//相当于sleep方法
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("顾客2包子开吃");
                }

            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                //花5s做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //保证等待和唤醒的线程只能有一个执行，需要使用同步代码块
                synchronized (obj){
                    System.out.println("老板5s之后做好包子，告知顾客，可以吃包子了");
                    //obj.notify()://如果有多个等待线程，随机唤醒一个
                    obj.notify();//唤醒所有等待线程



                }
            }
        }.start();

    }
}
