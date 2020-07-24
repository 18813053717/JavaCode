package List集合;
/*
    java.util.LinkedList集合实现了List接口
    特点：
        1.底层是一个链表结构，查询慢但是增删快
        2.包含了大量操作首尾元素的方法
    注意：如果想使用LinkedList集合特有的方法，则不能使用多态写法

 */

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        System.out.println(list);
        System.out.println("=====");
        /*
            public void addFirst(E e):将指定元素插入到此列表的开头
         */
        list.addFirst("b");
        list.addFirst("n");
        System.out.println(list);
        System.out.println("=====");
        /*
            public void addLast(E e):将指定元素插入到此列表的末尾
         */
        list.addLast("a");
        System.out.println(list);
        System.out.println("=====");
        /*
            public void push(E e):将元素推入此列表中的开头(等效于addFirst)
         */
        list.push("w");
        System.out.println(list);
        System.out.println("=====");
        /*
            public E getFirst():返回此列表中第一个元素
         */
        String one = list.getFirst();
        System.out.println(one);
        System.out.println(list);//获取并不会改变集合本身
        System.out.println("=====");
        /*
            public E getLast():返回此列表中最后一个元素
         */
        String last = list.getLast();
        System.out.println(last);
        System.out.println(list);
        System.out.println("=====");
        /*
            public E removeFirst()：移除并返回列表中第一个元素
         */
        String s = list.removeFirst();
        System.out.println(s);
        System.out.println(list);//remove方法会改变集合本身
        System.out.println("=====");
        /*
            public E removeLast()：移除并返回列表中最后一个元素
         */
        String s1 = list.removeLast();
        System.out.println(s1);
        System.out.println(list);
        System.out.println("=====");
        /*
            public E pop():从此列表所表示的堆栈处弹出一个元素
         */
        String pop = list.pop();
        System.out.println(pop);//相当于removeFirst
        System.out.println(list);
        System.out.println("=====");
        /*
            public boolean isEmpty():如果列表中不包含元素，则返回true
         */
        boolean empty = list.isEmpty();
        System.out.println(empty);

    }
}
