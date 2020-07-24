package Arrays类;
/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。
常用方法：
public stctic String toString(数组)，将参数数组变成字符串
和String类的toCharArray(String)方法相对应
public static void sort(数组)，按照默认升序（从小到大）将数据的元素进行排序
如果是数值，sort默认按照升序2从小到大
如果是字符串，sort默认按照字母升序
如果是自定义的类型，那么这个自定义的类需要Comparable或者Comparator接口的支持

 */

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[]array={10,20,30};
        //将int[]数组按照默认格式变成字符串
        String intstr= Arrays.toString(array);
        System.out.println(intstr);
        int[]array1={2,3,4,55,1,5};
        //默认排序，注意本静态方法没有返回值的
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

    }
}
