package final关键字修饰一个成员方法;
/*
当final关键字用来修饰一个成员方法的时候，这个方法就是最终方法，不能被覆盖重写
修饰符 final 返回值类型 方法名称（参数列表）{
    方法体
}
注意：
对于类、方法来说，abstract和final关键字不能同时使用，使用final意味着这个方法不能被覆盖重写，使用abstract意味着是个抽象方法，能且必须被覆盖重写
 */

public class Fu {
    public final void method(){
        System.out.println("父类方法执行");
    }
}
