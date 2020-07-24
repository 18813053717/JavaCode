package 线程实现方式.创建多线程程序的第一种方式_创建Thread子类的实例;
//创建一个Thread类的子类，重写run方法,设置线程任务
public class MyThread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("run"+i);
        }

    }
}
