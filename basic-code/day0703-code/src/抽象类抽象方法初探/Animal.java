package 抽象类抽象方法初探;
/*
抽象方法：
加上abstract关键字，然后去掉大括号，直接分号结束。
抽象类：
抽象方法所在的类必须是抽象类才行。在class之前写上abstract即可
 */
public abstract class Animal {
    //定义一个抽象方法，代表吃东西，但是具体吃什么（大括号的内容）不确定，没有{}方法体。
    public abstract void eat();
    public abstract void sleep();
    public abstract void game();
    //在抽象类里仍然可以定义普通的成员方法
    public void normal(){
        System.out.println("执行了普通的成员方法");

    }
}
