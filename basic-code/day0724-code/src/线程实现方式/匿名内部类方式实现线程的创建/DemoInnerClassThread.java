package 线程实现方式.匿名内部类方式实现线程的创建;
/*
    匿名内部类方式实现线程的创建

    匿名：没有名字
    内部类：写在其他类内部的类

    匿名内部类作用：简化代码
        把子类继承父类，重写父类的方法，创建子类对象合一步完成
        把实现类实现类接口，重写接口中的方法，创建实现类对象合一步完成
    匿名内部类的最终产物：子类/实现类对象，而这个类没有名字

    格式：
        new 父类/接口（）{
            重写父类/接口方法
        };

 */

import java.util.concurrent.ThreadPoolExecutor;
//本例程共创建了3个子线程
public class DemoInnerClassThread {
    public static void main(String[] args) {
        /*
            第一种方式
         */
        //线程的父类是Thread
        //new Mythread().start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+i);
                }
            }
        }.start();

        /*
            第二种方式
         */
        //RunnableImpl impl=new Runnable();
        //Thread thread=Thread(impl);
        //thread.start();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "->" + i);
                }
            }
        };
        new Thread(r).start();

        //第三种方式
        new Thread(new Runnable() {
            @Override
          public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+i);
                }
            }
        }).start();
    }
}
