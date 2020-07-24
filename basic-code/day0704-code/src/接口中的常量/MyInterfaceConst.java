package 接口中的常量;
/*
接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰
从效果上看，这其实就是接口的“常量”

格式：
public static final 数据类型 常量名称=数据值
注意事项：
1.接口当中的常量，可以省略public static final ,注意不写也照样是这样
2.接口当中的常量，必须进行赋值，不能不赋值
3.接口中常量的名称，使用完全大写的字母，而且用_进行分隔

使用方法：接口名称.常量名称


 */

public interface MyInterfaceConst {
    //在接口中如果直接 int num=10，这就是一个常量，一旦赋值不可修改
    //常量要用大写
    public static final int NUM=10;
    //public：大家都可以用
    //static：静态 使用方法  接口名称.常量名称
    //final：一旦使用final关键词，数据不可改变
}
