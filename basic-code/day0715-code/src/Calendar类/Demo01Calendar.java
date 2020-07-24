package Calendar类;
/*
    java.util.Calendar类:日历类
    Calendar是一个抽象类，无法直接创建使用，里面有一个getInstance（）方法，该方法返回了Calendar类的子类对象
 */

import java.util.Calendar;

public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

    }
}
