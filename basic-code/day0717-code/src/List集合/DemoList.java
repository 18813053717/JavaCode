package List集合;
/*
    java.util.List接口 extends Collection接口
    特点：
        1.有序的集合，存储元素和取出元素的顺序是一致的
        2.有索引，包含了一些带索引的方法
        3.允许存储重复的元素
    注意：操作索引的时候防止出现越界
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoList
{
    public static void main(String[] args) {
        //创建一个List集合对象（多态写法）
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        System.out.println(list);
        /*
            public void add(int index,E element)在指定的索引处添加指定的元素
         */
        list.add(0,"111");
        System.out.println(list);
        System.out.println("=====");
        /*
            public E remove(int index )移除指定索引处的元素，并返回该元素
         */
        String remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);
        System.out.println("=====");
        /*
            public E set(int index ,E element)用指定元素替换集合中指定位置的元素，返回更新之前的元素
         */
        String n = list.set(0, "n");
        System.out.println(n);
        System.out.println(list);
        System.out.println("=====");
        /*
            List集合遍历有3种方式
         */
        //1.普通的for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=====");
        //2.增强for循环
        for (String i:list) {
            System.out.println(i);
        }
        System.out.println("=====");
        //3.使用迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
