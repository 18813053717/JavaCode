package 类和对象关系简述及简单实现;
/*
面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个细节
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人来帮我完成

类和对象的关系：
类是对一类事物的描述，是抽象的
对象是一类事物的实例，是具体的
类是对象的模板，对象是类的实体
 */

import java.util.Arrays;

public class Demo01ObjectedOrientedOverview {
    public static void main(String[] args) {
        int[]array={10,20,30};
        //要求打印格式为：[10,20,30]
        //使用面向过程,每一个步骤细节都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                System.out.println(array[i]+"]");
            }
            else {
                System.out.print(array[i]+",");
            }
        }
        System.out.println("=========");
        //面向对象
        //找一个好的JDK给我们提供好的Arrays类，其中有一个toString方法，直接把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
