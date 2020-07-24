package 线程实现方式.Thread类的常用方法_sleep;
/*
    public static void sleep(Long millis):使当前正在执行的线程以指定的ms数暂停
    ms数结束之后，线程继续执行
 */

public class DemoSleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 1; i <=60; i++) {
            System.out.println(i);

            //使用Thread类的sleep方法让程序睡眠1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
