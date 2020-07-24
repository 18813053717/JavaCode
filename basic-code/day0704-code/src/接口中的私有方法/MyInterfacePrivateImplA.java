package 接口中的私有方法;

public class MyInterfacePrivateImplA implements  MyInterfacePrivateA{
    public void method(){
        //实现类中是可以访问default方法的，但是不应该单独访问
        //methodCommon1();
        //实现类中实现不了访问private方法，下面代码是错误的
        //methodCommon2();
    }
}
