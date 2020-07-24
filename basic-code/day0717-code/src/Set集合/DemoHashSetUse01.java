package Set集合;
/*
    HashSet实现类特点：
    1.不允许存储重复的元素
    2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
    3.是一个无序的集合，存储元素和取出元素的顺序可能不一样（与LinkedHashSet相对应）
    4.底层是一个哈希表结构（查询速度非常快）
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSetUse01 {
    public static void main(String[] args) {
        //多态写法创建一个HashSet集合
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);//重复的元素存储不进去
       //使用迭代器遍历集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println("========");
        //使用增强for遍历集合 set.for即可
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
