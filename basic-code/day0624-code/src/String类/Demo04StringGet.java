package String类;
/*
String 当中与获取相关的常用方法：
1.public int length（），获取字符串中含有的字符个数，拿到字符长度
2.public String concat(String str),将当前字符串与参数字符串拼接成为返回值作为新的字符串
3.public char charAt(int index),获取指定索引位置的单个字符
4.public int indexof(String str),查找参数字符在本地字符串当中首次出现的索引位置，如果没有则返回-1值
 */

public class Demo04StringGet {
    public static void main(String[] args) {
        //获取长度
        System.out.println("adddddddddddddd".length());
        System.out.println("=============");

        //拼接字符串
        String str1="hello";
        String str2="world";
        String str3=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=============");

        //获取指定索引位置的单个字符
        System.out.println(str1.charAt(1));
        System.out.println("=============");

        //查找单个字符在本地字符串中的位置
        System.out.println(str1.indexOf("o"));
        System.out.println(str1.indexOf("op"));
    }
}
