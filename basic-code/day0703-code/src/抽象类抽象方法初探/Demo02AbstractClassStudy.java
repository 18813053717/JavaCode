package 抽象类抽象方法初探;
/*
如何使用抽象类和抽象方法
1.不能直接创建new抽象类对象.
2.必须用一个子类来继承抽象父类
3.子类必须覆盖重写抽象父类当中所有的抽象方法
4.创建子类对象进行使用

 */

public class Demo02AbstractClassStudy {
    public static void main(String[] args) {
        //先创建一个子类来继承抽象父类,本次创建的类名称为Cat
        //在子类中覆盖重写抽象父类当中所有的抽象方法
        //创建子类对象进行使用
        Cat cat=new Cat();
        cat.eat();
        cat.normal();
        cat.game();
        cat.sleep();
    }
}
