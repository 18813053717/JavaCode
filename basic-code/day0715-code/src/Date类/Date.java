package Date类;
/*
java.util.Date:表示日期和时间的类
类Date表示特定的瞬间，精确到毫秒

毫秒值的作用：
可以对时间和日期进行计算

把日期转化为ms：
    当前日期：2088-01-11
    时间原点：（0毫秒）1970年1月1日00:00:00
    计算当前日期到时间原点之间一共经历了多少毫秒
把ms转换为日期
1day=86400000ms
 */



public class Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统一共到1970年1月1日00:00：00经历了多少ms
        demo01();
        demo02();
        demo03();
    }


    private static void demo01(){
        java.util.Date date = new java.util.Date();//Date类的空参构造，获取当前系统的日期和时间
        System.out.println(date);

    }
    private static void demo02(){
        java.util.Date date=new java.util.Date(0L);//Date类的带参构造。显示1970年1月1日00:00:00开始算，多少参数ms后的日期
        System.out.println(date);
    }
    private  static void demo03(){
        java.util.Date date =new java.util.Date();
        long time = date.getTime();//Date类中getTime成员方法相当于System.currentTimeMillis()
        System.out.println(time);
    }

}
