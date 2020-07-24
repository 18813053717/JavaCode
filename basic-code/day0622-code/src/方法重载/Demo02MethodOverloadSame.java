package 方法重载;
/*
    要求：
    比较两个数据是否相等，
    参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型
*/


public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a=10;
        byte b=20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)a,(short)b));
        System.out.println(isSame((int)a,(int)b));
        System.out.println(isSame((long)a,(long)b));
    }
    public static boolean isSame(byte a,byte b){
        System.out.println("两个byte参数的方法执行");
        return a==b;
    }
    public static boolean isSame(short a,short b){
        System.out.println("两个short参数的方法执行");
        return a==b;
    }
    public static boolean isSame(int a,int b){
        System.out.println("两个int参数的方法执行");
        return a==b;
    }
    public static boolean isSame(long a,long b){
        System.out.println("两个long参数的方法执行");
        return a==b;
    }


}
