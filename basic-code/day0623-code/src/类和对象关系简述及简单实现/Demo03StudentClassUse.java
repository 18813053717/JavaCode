package 类和对象关系简述及简单实现;
/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象才能使用

1.导包
也就是指出需要使用的类在什么位置
import 包名称.类名称
如import Student
对于和当前类属于同一个包的情况，可以省略导包语句不写
2.创建
类名称 对象名=new 类名称（）；
Student stu=new Student();
3.使用
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名（参数）

注意事项：
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样
 */

public class Demo03StudentClassUse {
    public static void main(String[] args) {
        //1.导包
        //需要使用的Student类，和我自己Demo03StudentClassUse位于同一个包下，所以可以省略导包语句不写
        //2.创建
        //类名称 对象名称=new 类名称（）；
        Student stu=new Student();
        //3.使用其中的成员变量、成员方法
        //使用对象的成员变量：对象名.成员变量
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=========");
        stu.name="aaa";
        stu.age=1;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=========");
        //使用对象的成员方法：对象名.成员方法
        stu.eat();
        stu.sleep();
        stu.study();
        System.out.println("+++++++++");
        //不需要创建对象来使用普通方法，直接使用类名称.方法名称()即可实现调用
        Student.eat2();

    }
}
