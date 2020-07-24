package 基本类型包装类;
/*
    包装类：
    基本数据类型，使用起来非常方便，但是没有对应的方法来操作这些基本类型的数据，
    可以使用一个类，把基本类型的数据装起来，在类中定义一些方法，这个类叫做包装类
    我们可以使用类中的方法来操作这些基本类型的数据

    装箱：把基本类型的数据包装到包装类中（基本类型的数据->包装类）
    构造方法：
        Integer(int value)
        Integer(String s)
    静态方法：
        static Integer valueof(int i)
        static Integer valueof(String s)

    拆箱：在包装类中取出基本类型的数据（包装类->基本类型的数据）
        成员方法：
            int intvalue()以int类型返回该Integer的值
 */

import java.sql.SQLOutput;

public class PackageClass {
    public static void main(String[] args) {
        //装箱
        //构造方法
        Integer in1=new Integer(1);//方法上有横线，方法过时了
        System.out.println(in1);

        Integer in2=new Integer("1");
        System.out.println(in2);

        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("2");
        System.out.println(in4);




        //拆箱
        int i = in1.intValue();
        System.out.println(i);



    }
}
