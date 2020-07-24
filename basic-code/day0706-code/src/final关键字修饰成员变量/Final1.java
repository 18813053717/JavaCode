package final关键字修饰成员变量;
/*
一旦使用final修饰成员变量，就相当于定义一个常量，必须大写，且用_隔开
1.由于成员变量具有默认值，所以用了final之后必须手动赋值
2.对于final成员变量，要么使用直接赋值，要么通过构造方法赋值
 */

public class Final1 {
    private final int NUM=10;



    public void show(){
        System.out.println(NUM);
    }
}
