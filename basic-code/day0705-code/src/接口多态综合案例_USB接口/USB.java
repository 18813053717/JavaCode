package 接口多态综合案例_USB接口;
//创建了一个名类USB的接口   将接口看做一个父类，将实现类看做一个子类即可
public interface USB {
    //两个抽象方法
    public abstract void open();
    public abstract void close();
}
