package 父子类构造方法访问特点;
/*
继承关系中，父子类构造方法的访问特点：
1.子类构造方法中有一个默认隐含的“super（）”调用，所以一定是先调用的父类构造方法，后调用的子类构造方法
2.可以通过super关键字来子类构造父类关键字重载构造
3.super的父类构造调用，必须是子类构造方法的第一行语句
总结：
子类必须调用父类构造方法，不写则赠送super（），写了则用写的指定的super调用，super只能有一个，还必须是第一行
 */

public class Demo01Constractor {
    public static void main(String[] args) {
        Zi zi =new Zi();
    }
}
