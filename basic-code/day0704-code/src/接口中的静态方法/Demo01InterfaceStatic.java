package 接口中的静态方法;
/*
不能通过接口实现类的对象调用接口当中的静态方法
原因：一个类可以实现多个接口，多个接口中静态方法名称可能重复导致冲突
正确用法：接口名称.静态方法名
 */

public class Demo01InterfaceStatic {
    public static void main(String[] args) {
        //对于调用静态方法来说，创建一个实现类是必须的，但是创建一个实现类对象是没必要的
        //因为静态方法是属于类的而不是属于对象的
        /*//创建一个实现类对象
        MyInterfaceStaticImplA A=new MyInterfaceStaticImplA();
        //A.methodStatic();错误写法*/
        //正确用法：接口名称.静态方法名
        MyInterfaceStatic.methodStatic();
    }
}
