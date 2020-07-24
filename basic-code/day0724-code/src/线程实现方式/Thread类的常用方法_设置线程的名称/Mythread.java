package 线程实现方式.Thread类的常用方法_设置线程的名称;
/*
    设置线程的名称：
        1.使用Thread类中的方法setName(name)
        2.创建一个带参数的构造方法，参数构造线程的名称，调用父类的带参构造方法，把线程名称传递给父类，让父类（Thread类的常用方法_sleep）给子线程起一个名字
 */

public class Mythread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public Mythread(){

    }

    public Mythread(String name){
        super(name);
    }
}
