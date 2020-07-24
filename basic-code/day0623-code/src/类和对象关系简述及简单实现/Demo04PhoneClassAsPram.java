package 类和对象关系简述及简单实现;
/*
类可以作为方法的参数
 */
public class Demo04PhoneClassAsPram {
    public static void main(String[] args) {
        Phone one =new Phone();
        one.brand="苹果";
        one.price=8848;
        one.color="土豪金";

        method(one);

    }
    //定义一个method普通方法
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);

    }
}
