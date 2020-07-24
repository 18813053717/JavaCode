package 接口中的私有方法;

public class MyInterfacePrivateImplB implements  MyInterfacePrivateB{
    public void method(){

        //实现类中实现不了访问private方法，下面代码是错误的
        //methodCommon();
    }
}
