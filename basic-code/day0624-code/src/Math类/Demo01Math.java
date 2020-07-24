package Math类;
/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作

public static double abs(double num)   返回绝对值,有多种重载
public static double ceil(double num)   向上取整（不会四舍五入）
public static double floor(double num)  向下取整（不会四舍五入）
public static double round(double num)  四舍五入
Math.PI   π值
 */

public class Demo01Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3.14));//3.14
        System.out.println(Math.ceil(3.14));//4
        System.out.println(Math.floor(3.14));//3
        System.out.println(Math.round(3.14));//3

    }
}
