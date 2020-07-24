package 接口中的私有方法;

public class Demo02MyInterfacePrivate {
    public static void main(String[] args) {
        MyInterfacePrivateImplB B=new MyInterfacePrivateImplB();
        B.method();
        MyInterfacePrivateB.methodDefault1();
        MyInterfacePrivateB.methodDefault2();
    }
}
