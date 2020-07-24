package 接口中的默认方法;

public class Demo01InterfaceDefault {
    public static void main(String[] args) {

        //创建了实现类对象
        MyInterfaceDefaultImplA A=new MyInterfaceDefaultImplA();
        //在实现类中重写了methodAbs()方法
        A.methodAbs();
        //实现类中继承了接口中定义的默认方法
        A.methodDefault();

        System.out.println("=======");
        MyInterfaceDefaultImplB B=new MyInterfaceDefaultImplB();
        B.methodAbs();
        //实现类中覆盖重写了接口中定义的默认方法
        B.methodDefault();
    }
}
