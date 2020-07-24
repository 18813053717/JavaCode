package Scanner类;
/*
Scanner类的功能：可以实现键盘输入数据，到程序当中

引用类型的一般使用步骤：
1.导包
import 包路径.类名称
如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写
只有java.lang包下的内容不需要导包，其他的包都需要import语句
2.创建
类名称 对象名=new 类名称（）；

3.使用
对象名.成员方法名（参数格式 参数名称）
 */


import java.util.Scanner;//万年不变导包语句

public class Demo01Scanner {
    public static void main(String[] args) {
        //创建
        //Systrm.in代表从键盘输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整形数字：");
        int num=sc.nextInt();//nextInt()将输入的字符串转换成了int（）类型返回
        String str=sc.nextLine();
        System.out.println("输入的数字是："+num);
        System.out.println("输入的字符串是"+str);

    }
}
