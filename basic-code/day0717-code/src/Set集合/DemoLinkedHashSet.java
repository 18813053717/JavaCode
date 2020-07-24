package Set集合;
/*
    java.util.LinkedHashSet集合 extends HashSet集合
    特点：
        底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();//无序且不允许元素重复
        set.add("hello");
        set.add("world");
        set.add("hello");
        set.add("java");
        System.out.println(set);

        /*

         */
        LinkedHashSet<String> set1=new LinkedHashSet<>();//有序但不允许元素重复
        set1.add("hello");
        set1.add("world");
        set1.add("hello");
        set1.add("java");
        System.out.println(set1);

    }
}
