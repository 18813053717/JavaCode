package Collection类常用功能;
/*
    Collection是所有单列集合的父接口，在Collection中定义了单列集合（List和Set）通用的一些方法

 */

import java.util.ArrayList;
import java.util.Collection;


public class Demo01Collection {
    public static void main(String[] args) {
        //创建一个集合对象(多态写法)
        Collection<String> coll=new ArrayList<>();
        System.out.println(coll);
        System.out.println("======================");

        /*
            public boolean add(E e):添加指定的对象到集合中
         */
        boolean b1 = coll.add("张三");
        System.out.println(b1);
        coll.add("李四");
        coll.add("王五");
        System.out.println(coll);
        System.out.println("=======================");

        /*
            public boolean remove(E e):把指定的对象在集合中删除
         */
        boolean remove = coll.remove("李四");
        System.out.println(remove);
        System.out.println(coll);
        System.out.println("========================");
        /*
            public boolean contains(E e):判断当前集合中是否包含给定的对象
         */
        System.out.println(coll.contains("张三"));
        System.out.println(coll.contains("李四"));
        System.out.println("========================");
        /*
            public boolean isEmpty():判断当前集合是否为空
         */
        System.out.println(coll.isEmpty());
        System.out.println("=========================");
        /*
            public int size()：返回集合当中元素的个数
         */
        System.out.println(coll.size());
        System.out.println("=========================");
        /*
            public Object[] toArray():把集合中的元素存储到数组中
         */
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==========================");
        /*
            public void clear():清空集合中的所有元素，但不删除集合
         */
        coll.clear();
        System.out.println(coll);



    }


}
