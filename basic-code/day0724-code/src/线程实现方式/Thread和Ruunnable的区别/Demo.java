package 线程实现方式.Thread和Ruunnable的区别;
/*  多线程程序尽量使用实现Runnable接口的方式
    实现Runnable接口创建多线程程序的好处:
        1.避免了单继承的局限性
            一个类只能继承一个类（一个人只能有一个亲爹），类继承了Thread类就不能继承其他的类
            实现了Runnable接口，还可以继承其他的类，实现其他的接口
        2.增强了程序的扩展性，降低了程序的耦合性
            实现Runnnable接口的方式，把设置线程任务和开启新线程进行了分离（解耦）：传递不同的实现类，实现不同的任务
            实现类中，重写了run方法：用来设置线程任务
            创建Thread类对象，调用start方法：用来开启新线程
 */

public class Demo {
    public static void main(String[] args) {
        RunnableImpl1 one=new RunnableImpl1();
        Thread thread = new Thread(one);
        thread.start();


        Thread thread1 = new Thread(new RunnableImpl2());
        thread1.start();

    }
}
