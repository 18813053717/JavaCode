package 接口及其实现类格式以及接口中的抽象方法;
/*
接口就是多个类的公共规范。
接口是一种引用数据类型，最重要的内容就是其中的抽象方法

定义一个接口的格式：
public interface 接口名称{
//接口内容
}
接口完全可以当做一个父类来理解

接口内容：
1.常量
2.抽象方法
3.默认方法
4.静态方法
5.私有方法
tips：接口中没法直接定义变量
接口使用步骤：
1.接口不能直接使用，必须有一个“实现类”来“实现”该接口。
接口格式：
public interface 接口名称{}
接口实现类格式“
public class 实现类名称 implements 接口名称{}
普通子类实现格式：
public class 类名称 extends 父类名称{}
2.接口的实现类必须覆盖重写接口中所有的抽象方法（类似抽象类和抽象类的实现）
3.创建实现类的对象，进行使用

//如果实现类并没有覆盖重写接口中所有的抽象方法，那么这是实现类自己就必须是抽象类


 */

public class Demo01Interface {
    public static void main(String[] args) {
        /*MyInterfaceAbstract inter1=new MyInterfaceAbstract() {
            @Override
            public void methodAbs1() {
                System.out.println("试一试");

            }

            @Override
            public void methodAbs2() {
                System.out.println("再试一试");

            }
        };
        inter1.methodAbs1();
        inter1.methodAbs2();//自己研究的用法，这种用法适用于接口中的抽象函数数目很少以及要创建的对象的数目很少的时候，否则会大量占用代码空间*/
        MyInterfaceAbstractImpl inter2=new MyInterfaceAbstractImpl();
        inter2.methodAbs1();
        inter2.methodAbs2();
    }
}
