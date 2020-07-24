package 接口及其实现类格式以及接口中的抽象方法;
/*
在任何版本的Java中，接口都可以定义抽象方法
public abstract 返回值类型 抽象方法名称（参数列表）；

注意事项：
1.接口当中的抽象方法，修饰符必须是两个固定的关键字 public abstract
2.这两个关键字修饰符，可以选择性的省略
3.方法的三要素，可以随意定义（方法的返回值、方法的名称、方法的参数）
 */

public interface MyInterfaceAbstract {
    //定义两个抽象方法，注意抽象方法是没有方法体的
    public abstract void methodAbs1();
    public abstract void methodAbs2();

}
