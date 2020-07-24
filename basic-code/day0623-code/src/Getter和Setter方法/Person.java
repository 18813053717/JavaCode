package Getter和Setter方法;
/*
问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来
解决方案：用private关键字将需要保护的成员变量进行修饰

一旦使用private进行修饰，本类当中仍然可以随意访问
但是超出了本类的范围就不能再直接访问了

间接访问private成员变量，就需要定义一对Getter和Setter方法
对于Getter来说，不能有参数，返回值类型与成员变量对应
对于Setter来说，不能有返回值，参数类型与成员变量对应
定义Setter方法的格式：
public void set+private类型成员变量名称（首字母大写）（private类型成员变量的变量类型 自定义变量名称）{
    private类型成员变量名称=自定义变量名称；
}
定义Getter方法的格式：
public private类型成员变量的变量类型 get+private类型成员变量名称（首字母大写）（）{
    return private类型成员变量名称；
}
使用private好处：
一旦使用了private，外部程序无法直接使用该成员变量，只能通过间接方法来使用，在间接方法中可以编写代码阻止不合理数据的出现，提高代码的安全性
 */

public class Person {
    String name;//姓名
    private int age=15;//年龄
    public void show(){
        System.out.println("我叫"+name+"今年"+age+"岁了");
    }
    //这个成员方法，专门用来向age设置数据
    public void setAge(int num){
        //setAge成员方法里面，可以对输入的num进行判定，来消除不合理的事情
        age=num;
    }
    //这个成员方法，专门用于获取age的数据
    public int getAge(){
        return age;
    }
}
