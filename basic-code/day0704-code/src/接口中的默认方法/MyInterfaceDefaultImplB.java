package 接口中的默认方法;

public class MyInterfaceDefaultImplB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法BBB");
    }
    //可以对默认方法进行覆盖重写
    @Override
    public void methodDefault() {
        System.out.println("实现了覆盖重写方法CCC");

    }
}
