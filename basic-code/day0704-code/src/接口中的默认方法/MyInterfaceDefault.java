package 接口中的默认方法;
/*
从Java8开始，接口里允许定义默认方法（应用广泛）
格式：
public default 返回值类型 方法名称（参数列表）{
    方法体
}

备注：接口当中的默认方法，可以解决接口升级的问题
假设接口中仅定义了一个抽象方法，已经有两个实现类重写了这个抽象方法，重写了仅这一个抽象方法
现在要对接口进行升级，需要定义另一个抽象方法，之前的两个实现类如果不重写第二个抽象方法的话就会报错，但两个实现类已经在使用不好进行改动

1.接口的默认方法，可以直接通过接口实现类对象直接调用
2.接口的默认方法，也可以被接口实现类进行覆盖重写（即在实现类中即可以选择重写默认方法，也可以选择不重写默认方法）
 */

public interface MyInterfaceDefault {
    //定义一个抽象方法
    public abstract void methodAbs();
    //若定义另一个抽象方法,两个实现类会炸的
    //public abstract void methodAbs1();
    //新添加的方法改成默认方法就可结局问题，default关键字不可省略
    public default  void methodDefault(){
        System.out.println("这是一个默认方法");
    }

}
