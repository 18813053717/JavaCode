package 线程实现方式.Thread类的常用方法_设置线程的名称;


public class DemoSetThreadName {
    public static void main(String[] args) {
        /*
            设置线程名称的第一种方法
         */
        Mythread mt =new Mythread();
        mt.setName("小强");
        mt.start();

        /*
            设置线程名称的第二种方法
         */
        Mythread mt2=new Mythread("旺财");
        mt2.start();

    }
}
