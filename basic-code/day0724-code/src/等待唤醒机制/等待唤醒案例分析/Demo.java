package 等待唤醒机制.等待唤醒案例分析;
/*
    等待唤醒（线程之间的通信）
        创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait方法，放弃cpu的执行，进入WAITING状态（无限等待）
        创建一个老板线程（生产者）：花了5s做包子，做好包子之后，调用notify方法，唤醒顾客吃包子

    注意：
        1.顾客和老板线程必须得使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
        2.同步使用的锁对象必须保证是唯一的
        3.只有锁对象才能调用wait和notify方法



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
                    System.out.println("告知老板要的包子的种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("包子开吃");
                }

            }
        }.start();

        //创建老板线程
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
                    obj.notify();



                }
            }
        }.start();

    }
}
