package Date类;
/*
    java.text.DateFormat
    作用：
    格式化（日期->文本）
    解析（文本->日期）

    构造方法：
    SimpleDateFormat(String Pattern)
    用指定的模式和默认语言环境的日期格式符号构造

    y 年
    M 月
    d 日
    H 时
    m 分
    s 秒
    写对应的模式，会把模式替换为对应的日期和时间
    “yyyy-MM-dd HH:mm:ss”
    注意：模式中的字母不能更改，连接模式的符号可以更改


 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatClass {
    public static void main(String[] args) throws ParseException {
      demo01();
      demo02();
    }
    /*
   使用DateFormat类中的方法parse，把文本格式化为日期
   使用步骤：
       1.创建一个SimpleDateFormat对象，构造方法中传递指定的模式
       2.调用SimpleDateFormat对象中的方法format
    */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse("2020-07-15 17:34:28");
        System.out.println(parse);

    }

    /*
    使用DateFormat类中的方法format，把日期格式化为文本
    使用步骤：
        1.创建一个SimpleDateFormat对象，构造方法中传递指定的模式
        2.调用SimpleDateFormat对象中的方法format
     */
    private static void demo01() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();//获取当前系统的日期
        System.out.println(sdf.format(date));//按照上述格式进行变动

    }
}
