package 接口及其实现类格式以及接口中的抽象方法;

public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    //创建一个实现类，用的不再是extends关键字，而是implements。实现的是MyInterfaceAbstract接口
    //父类和子类之间的单继承或者接口之间的多继承用的关键字是extends
    //实现类和接口之间的单实现或者多实现用的关键字是implements


    //对接口中所有的抽象方法都要进行覆盖重写
    @Override
    public void methodAbs1() {
        System.out.println("这是第一个方法");

    }

    @Override
    public void methodAbs2() {
        System.out.println("这是第二个方法");

    }
}
