package 类和对象关系简述及简单实现;

public class Demo05PhoneClassAsReturnvalue {
    public static void main(String[] args) {
        Phone two=getphone();
        System.out.println(two.price);

    }
    public static Phone getphone(){//返回值类型为Phone类
        Phone one =new Phone();
        one.price=8848;
        return one;//返回值类型为Phone类
    }
}
