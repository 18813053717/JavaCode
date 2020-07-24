package 泛型;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        show01();
        show02();
    }
    /*
    创建集合对象，使用泛型
    好处：
        1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
        2.把运行期异常提升到了编译期
    缺点：
        泛型是什么类型，就只能存储什么类型的数据了
     */

    private static void show02() {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        //list1.add("111");//只能存储int类型的数据了
        list1.add(2);
        Iterator<Integer> iterator = list1.iterator();
        //使用迭代器
        while(iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i);
        }
        //使用增强for循环
        for (int i :list1) {
            System.out.println(i);

        }
    }

    /*
        创建集合对象，不使用泛型
        好处：
            集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
        缺点：
            不安全，会引发异常
     */
    private static void show01() {
        //不使用泛型创建一个集合对象
        ArrayList list=new ArrayList();
        list.add("aaa");
        list.add(1);

        //获取Iterator迭代器
        Iterator it = list.iterator();
        //使用迭代器中的方法
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            //想要使用String类特有的方法
            //需要向下转型
            //会抛出类型转换异常，不能把Integer类型转换为String类型
          /*  String str=(String) obj;
            int length = str.length();
            System.out.println(length);*/

        }




    }
}
