package 线程实现方式.主线程;
/*
    主线程：执行主（main）方法的线程
    单线程程序：java程序中只有一个线程
    执行从main方法开始，从上到下依次执行

 */

public class DemoMainThread {
    public static void main(String[] args) {
        /*
            单线程顺序执行
         */
        Person p1=new Person("小强");
        p1.run();
        System.out.println(0/0);//单线程程序的弊端，出现异常导致后面程序无法执行，考虑分两个线程来分别执行
        Person p2=new Person("小王");
        p2.run();
    }
}
