package 匿名内部类重点;
/*
如果接口的实现类，或者是父类的子类，只需要使用唯一的一次
这种情况下就额可以省略掉该类的定义，而直接使用匿名内部类

匿名内部类的定义格式：
接口名称 对象名 =new 接口名称（）{
    //覆盖重写所有抽象方法
}
使用匿名内部类的注意事项：
对格式“new 接口名称（）{...}”进行解析
1.new代表创建对象的动作
2.接口名称就是匿名内部类需要实现哪个接口
3.{..}才是匿名内部类的内容

注意事项
1.匿名内部类，在创建对象的时候，只能使用唯一一次
2.匿名内部类是省略了实现类/子类名称，匿名对象是省略了对象名称，两者不是一回事


 */

public class DemoMain {

    public static void main(String[] args) {
        //接口名称 对象名 = new 实现类名称（）；这是一种多态的写法
        MyInterFace impl =new MyInterFaceImpl();
        impl.method1();

        //采用匿名内部类（参考抽象类实现方法self版本）{}即为匿名内部类
        //接口名称 对象名 =new 接口名称（）{//覆盖重写接口中所有的抽象方法}
        MyInterFace some =new MyInterFace() {
            @Override
            public void method1() {
                System.out.println("111");

            }

            @Override
            public void method2() {
                System.out.println("222");

            }

        };
        some.method1();
    }
}
