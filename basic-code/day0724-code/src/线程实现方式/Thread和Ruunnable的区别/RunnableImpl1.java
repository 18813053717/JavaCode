package 线程实现方式.Thread和Ruunnable的区别;

public class RunnableImpl1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("helloworld"+i);
        }
    }
}
