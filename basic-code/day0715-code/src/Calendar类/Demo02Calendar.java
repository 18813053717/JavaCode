package Calendar类;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();

    }




    /*
    public int get(int field);返回给定日历字段的值
    参数：传递指定的日历字段
    返回值：日历字段代表的具体的值
     */
    private static void demo01() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);

    }
    /*
    public void set(int field ,int value)
        传递指定的日历字段，给指定字段设定值
     */
    private static void demo02() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,9999);
        System.out.println(c.get(Calendar.YEAR));
        c.set(1111,8,1);//方法的重载
        System.out.println(c.get(Calendar.YEAR)+"year"+c.get(Calendar.MONTH)+"month"+c.get(Calendar.DATE)+"day");

    }
    /*
    public abstract void(int field ,int amount)
    把指定的字段增加/较少指定的值
     */

    private static void demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,1);
        int yaer = c.get(Calendar.YEAR);
        System.out.println(yaer);
    }
    /*
    public Date getTime()
    把日历转换为日期对象
     */
    private static void demo04() {
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);



    }
}
