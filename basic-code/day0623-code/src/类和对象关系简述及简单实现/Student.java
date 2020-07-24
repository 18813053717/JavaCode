package 类和对象关系简述及简单实现;
/*
定义一个类，用来模拟“学生“事物，其中有两个组成部分

属性（是什么）：
    姓名
    年龄
行为（能做什么）
    吃饭
    睡觉
    学习
对应到Java的类当中：
成员变量（属性）：
    String name;//姓名
    int age;//年龄
成员方法（行为）：
    public void eat(){}//吃饭
    public void sleep(){}//睡觉
    public void study(){}//学习
注意事项：
1.成员变量是直接定义在类当中的，在方法外边
2.成员方法不要写static关键字，普通方法才需要写static关键字
3.成员方法和普通方法的区别和联系：
相同点：都是在类体中用来完成一些功能
不同点：成员方法是由对象来调用的，普通方法不需要创建对象，可直接通过类来调用


类.java文件是不可以直接编译的，因为他没有main方法
 */

public class Student {
    //成员变量
    String name;//姓名
    int age;//年龄
    //成员方法
    public void eat(){

        System.out.println("chifan ");
    }
    public void sleep(){
        System.out.println("shuijiao");
    }
    public void study(){

        System.out.println("xuexi");
    }
    //普通方法
    public static void eat2(){
        System.out.println("吃饭");
    }
}
