package Set集合;
/*
    java.util.Set接口 extends Collection
    特点：
    1.不允许存储重复的元素
    2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历

    哈希表：数组+链表/红黑树

    Set集合存储元素不重复的原理:
        Set集合在调用add方法的时候，add方法会调用元素的hashCode()方法和equals()方法判断元素是否重复
        1.哈希值不相同则可直接存储
        2.哈希值相同但equals方法的返回值为false也可以存储


 */

import java.util.HashSet;

public class DemoSet {
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        /*
           add方法会调用s1的hashCode方法，计算字符串“abc”的哈希值，哈希值为96354
           在集合中找有没有96354这个哈希值的元素，发现没有就会把s1存储到集合中
         */
        set.add(s1);
        /*
           add方法会调用s2的hashCode方法，计算字符串“abc”的哈希值，哈希值为96354
           在集合中找有没有96354这个哈希值的元素，发现有（哈希冲突）
           s2会调用equals方法和哈希值相同的元素进行比较 s2.equals(s1),返回true
           两个元素的哈希值相同，equals方法返回true，认定两个元素相同
           就不会把s2存储到集合中
         */
        set.add(s2);
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
         /*
           add方法会调用“重地”的hashCode方法，计算字符串“重地”的哈希值，哈希值为1179395
           在集合中找有没有1179395这个哈希值的元素，发现没有就会把“重地”存储到集合中
         */
        set.add("重地");
        /*
           add方法会调用“通话”的hashCode方法，计算字符串“abc”的哈希值，哈希值为1179395
           在集合中找有没有1179395这个哈希值的元素，发现有（哈希冲突）
           “通话”会调用equals方法和哈希值相同的元素进行比较 “通话”.equals(“重地”),返回false
           两个元素的哈希值相同，equals方法返回false，认定两个元素不相同
           就会把“通话”存储到集合中
         */
        set.add("通话");

        System.out.println(set);
    }
}
