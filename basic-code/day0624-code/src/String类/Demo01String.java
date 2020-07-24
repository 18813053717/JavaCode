package String类;
/*
字符串的特点：
1.字符串的值在创建之后不能更改
2.正是因为字符串不可改变，所以字符串是可以共享使用的
3.字符串效果上相当于是char型字符数组，但是底层原理byte[]字节数组
创建字符串的3+1种方法
三种构造方法“
public String(),创建一个空白字符串，不含有任何内容String str=new String();
public String(char[] array),根据字符数组的内容创建对应的字符串String str=new String(array1)
public String(byte[] array),根据字节数组的内容创建对应的字符串String str=new String(array2)
一种直接创建：
String str="hello"
注意：直接写上双引号，就是字符串对象,字符串作为一个对象，是拥有众多成员方法的，如.length

 */


public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1=new String();
        System.out.println(str1);

        //根据字符数组创建字符串
        char[] chararray={'a','b','c'};
        String str2=new String(chararray);
        System.out.println(str2);

        //根据字节数组创建字符串
        byte[] bytearray={97,98,99};
        String str3=new String(bytearray);
        System.out.println(str3);

        //直接创建
        String str4="abc";
        System.out.println(str4);
        System.out.println(str4.length());

    }
}
