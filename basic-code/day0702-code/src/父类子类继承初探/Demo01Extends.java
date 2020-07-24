package 父类子类继承初探;
/*
继承主要解决的问题就是：共性抽取
父类（基类、超类）
子类（派生类）
继承关系当中的特点：
1.子类可以拥有父类的内容（可继承的内容）
2.子类还可以拥有自己专有的内容
在继承的关系中，“子类就是一个父类”，也就是说，子类可以被当做父类看待

格式
定义父类的格式：（一个普通的类定义）
public class 父类名称{
    //..
}
定义子类的格式：
public class 子类名称 extends 父类名称{
//
}

在父子类的继承关系当中，如果成员变量重名，创建子类对象时，访问有两种方式：
1.直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找
2.间接通过成员方法访问成员变量
    该方法属于谁就优先用谁，没有则向上找

 */

public class Demo01Extends {
    public static void main(String[] args) {
        //创建了一个父类对象
        Employee employee=new Employee();
        //创建了一个子类对象
        Teacher teacher=new Teacher();
        //Teacher类当中虽然什么都没写，但是会继承来自父类的method方法
        teacher.method();
        //创建了另一个子类对象
        Assistant assistant=new Assistant();
        //Assistant类当中虽然什么都没写，但是也会继承来自父类的method方法
        assistant.method();
        System.out.println("=============");

        //父类可以访问自己类中的成员变量
        System.out.println(employee.numfu);
        //父类不可以访问子类中的成员变量
        //System.out.println(employee.numzi);错误写法
        System.out.println("=============");


        //子类可以访问父类中的成员变量
        System.out.println(teacher.numfu);
        //子类也可以访问自己类中的成员变量
        System.out.println(teacher.numzi);
        //子类不可以访问其他子类特有的成员变量
        //System.out.println(teacher.numzi2);错误写法

        //父类和子类中的成员变量有重名的情况
        //直接通过子类对象访问成员变量
        System.out.println(teacher.num);//优先子类，200
        System.out.println("============");


        //这个方法是子类的，优先用子类的，没有再向上找
        teacher.methodzi();//200
        //这个方法是在父类当中定义的
        teacher.methodfu();//100

    }
}
