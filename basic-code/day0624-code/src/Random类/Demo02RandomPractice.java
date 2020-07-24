package Random类;
/*
题目要求：
根据int变量n的值，来获取随机数字，范围是[1,n],可以取到1，也可以取到n

思路：
1.定义变量n，随意赋值
2.使用Random，三个步骤，导包、创建、使用
3.如果写10，那就是0-9，想要1-10，整体加1即可
 */

import java.util.Random;

public class Demo02RandomPractice {
    public static void main(String[] args) {
        int n=100;
        Random r=new Random();
        for (int i = 0; i <n; i++) {
            int result=r.nextInt(n)+1;//(0-n-1)+1=(1-n)
            System.out.println(result);

        }



    }
}
