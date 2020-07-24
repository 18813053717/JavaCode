package final关键字修饰一个类;
/*
当final关键字用来修饰一个类的时候
格式：
public final class类名称{

}
含义：当前这个类不能有任何的子类，但是一定有父类
注意：一个类如果是final的，其中所有的成员方法都无法进行覆盖重写，（香火断了）
 */

public final class MyClass {
    public void method(){
        System.out.println("方法执行");
    }
}
