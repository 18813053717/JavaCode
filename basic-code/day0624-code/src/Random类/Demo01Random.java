package Random类;
/*
Random:用来产生随机数
使用方法：
1.导包
import java.util.Random;
2.创建
Random r= new Random();
3.使用
获取一个随机的int数字（范围是int所有范围，有正负）,int num=r.nextInt();
获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num=r.nextInt(3)
实际上代表的含义是：[0,3)也就是0-2
 */

import java.util.Random;



public class Demo01Random {
    public static void main(String[] args) {
        //无限制范围
        Random r=new Random();
        int num=r.nextInt();
        System.out.println(num);
        System.out.println("==========");
        //有限制范围（0-2）
        Random r1=new Random();
        int num1=r1.nextInt(3);
        System.out.println(num1);





    }
}
