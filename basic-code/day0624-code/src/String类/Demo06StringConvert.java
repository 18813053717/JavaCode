package String类;
/*
String类型当中与转换相关的常用方法
1.public char[] toCharArray(); 将当前字符串拆分成字符数组作为返回值
2.public byte[] getBytes();获取当前字符串底层的字节数组
3.public String replace(CharSequence oldString,CharSequence newString)
将所有出现的老字符串替换为新的字符串，返回替换之后的结果新字符串
 */

public class Demo06StringConvert {
    public static void main(String[] args) {
        //拆分成为字符数组
        char[]chars="hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("=========");
        //拆分成字节数组
        byte[]bytes="abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);

        }
        System.out.println("==========");
        //替换

        System.out.println("helloworld".replace("world","java"));
    }
}
