package Iterator接口;
/*
    java.util.Iterator接口：迭代器（对集合进行遍历）
    常用方法：
        1.boolean hasNext()如果仍有元素可以迭代，则返回true
        2.E next（）返回迭代的下一个元素
    Iteratord迭代器是一个接口，无法直接使用，获取实现类的方式比较特殊
    Collection接口中有一个方法叫做iterator（），这个方法返回的就是Iterator迭代器实现类对象

    迭代器使用步骤：
        1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
        2.使用Iterator接口中的方法hasNext（）判断还有没有下一个元素
        3.使用Iterator接口中的方法next取出集合中的下一个元素
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
        //多态创建一个Collection对象
        Collection<String> coll =new ArrayList<>();
        //往集合中添加元素
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        //获取迭代器
        //Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走
        Iterator<String> it = coll.iterator();
        //不知道集合中有多少元素，所以使用while循环
        while(it.hasNext()){

            System.out.println(it.next());

        }        /*//判断有没有下一个元素
        boolean b = it.hasNext();
        System.out.println(b);//true，说明集合中有元素，若集合中没有元素，会返回false

        String next = it.next();//next方法既取出一位，也将指针移动一位
        System.out.println(next);

        String next1 = it.next();
        System.out.println(next1);

        System.out.println(coll);*/


    }
}
