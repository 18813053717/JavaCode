package 多态应用思路;
/*
假设存在一个员工抽象类，含有一个抽象方法work（）；
现在需要定义一个讲师类和一个助教类，分别有一个讲课方法和辅导方法
如果不同多态，只用子类，那么写法是：
Teacher one=new Teacher();
one.work();//讲课
Assistant two=new Assistant();
two.work();//辅导
唯一要做的事情，就是调用work方法，其他的功能不关心

如果使用多态的写法，对比一下：
Employee one =new Teacher();
one.work();//讲课
Employee two =new Assistant();
two.work();//辅导
对于多态中的成员方法来说，编译看左边，指的是Employee中必须有这个方法才可以。运行看右边指的是运行的是Teacher里的方法

好处：不论右边new的时候换成换成哪个对象，等号左边调用方法都不会变化
 */

public class MultiAdvantage {
}
