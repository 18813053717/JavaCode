package 泛型;
/*
    测试含有泛型的方法
 */

public class Demo02GenericMethod {
    public static void main(String[] args) {
        //创建对象
        GenericClassMethod one=new GenericClassMethod();
        //调用含有泛型的方法，在使用方法时确定泛型的类型
        one.method01(1);
        one.method01("ssssssss");


        //调用含有泛型的静态方法
        GenericClassMethod.method02(1111);

    }
}
