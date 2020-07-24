package StringBuilder类;
/*
    java.lang.StringBuilder类：字符串缓冲区：可以提高字符串的效率
    构造方法：
    1.StringBuilder（）构造一个不带任何字符的字符串生成器，其初始容量为16个字符
    2.StringBuilder（String str）构造一个字符串生成器，并初始化为指定的字符串内容

    成员方法：
    1.public StringBuilder append(..):添加任意类型的字符串形式，并返回当前对象自身
    2.toString
 */

public class Demo01StringBuilder {
    public static void main(String[] args) {
        //空参构造方法
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);

        //带字符串的构造方法
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);

        //使用append方法向bu2中添加数据
        bu2.append(111);
        System.out.println(bu2);
        System.out.println(bu2.append(222));
        /*
            链式编程
         */
        System.out.println(bu2.append(1).append('d').append(9.0));



        String str="hello";
        System.out.println("str:"+str);
        StringBuilder bu=new StringBuilder(str);
        //往Stringbuilder中添加数据
        bu.append("world");
        System.out.println("bu:"+bu);

        //StringBuilder->String
        String s = bu.toString();
        System.out.println("s："+s);



    }
}
