package String类;
/*
==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：
public boolean equals(Object obj),参数可以是任何对象，只有参数是一个字符串并且内容相同的才给true，否则返回false
1.任何对象都鞥用Object进行接收
2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)
3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面
推荐“abc”.equals(str)   不推荐str.equals("abc")
public boolean equalsIgnoreCase(String str),忽略大小写进行比较
 */

public class Demo03StringMethod {
    public static void main(String[] args) {
        //创建3个字符串
        String str1="abc";
        String str2="abc";
        char[] charArray={'A','b','c'};
        String str3=new String(charArray);
        //判断字符串内容是否相同
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println("abc".equals(str3));
        //忽略大小写的比较
        System.out.println("abc".equalsIgnoreCase(str3));


    }
}
