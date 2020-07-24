package 增强for循环;
/*
    增强for循环：
    底层也是使用的迭代器，专门用来遍历数组和集合的，它的内部原理其实是一个Iterator迭代器，所以在遍历的过程中不能对集合中的元素进行增删操作
    格式：
    for(元素的数据类型 变量：Collection集合or数组){
        //写操作代码
    }

    注意：不管是集合还是数组，只要是要进行遍历，就使用增强for循环，增强for循环没有索引
 */

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        /*
        增强for循环遍历数组
         */
        int []arr={1,2,3,4};
        for (int a:arr) {
            System.out.println(a);

        }
        /*
         增强for循环遍历集合
         */
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("BBB");
        for (String str:coll) {
            System.out.println(str);

        }
    }
}
