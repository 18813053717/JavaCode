package 接口中的私有方法;

public class Demo01MyInterfacePrivate {
    public static void main(String[] args) {
        MyInterfacePrivateImplA A=new MyInterfacePrivateImplA();
        A.method();
        A.methodCommon1();//不应该存在的
        A.methodDefault1();
        A.methodDefault2();
    }
}
