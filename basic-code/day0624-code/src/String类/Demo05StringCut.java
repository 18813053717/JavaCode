package String类;
/*
字符串中的截取方法：

public String substring(int index),截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin,int end),截取从begin开始，一直到end结束
[begin,end)
 */

public class Demo05StringCut {
    public static void main(String[] args) {
        String str="helloworld";
        int num=str.indexOf("w");

        String substr=str.substring(num);
        System.out.println(substr);

        String substr1=str.substring(1,5);//截取5-1=4个元素，从下标为1的元素开始
        System.out.println(substr1);

        //下面这种写法，字符串的内容仍然是没改变的
        //下面有两个字符串：“hello”“world”
        //strA中保存的是地址值
        //本来的地址值是“hello”的0x666
        //后来的地址值是“world”的0x999
        String strA="hello";
        System.out.println(strA);
        strA="world";//此处相当于新建了一个字符串对象
        System.out.println(strA);
    }
}
