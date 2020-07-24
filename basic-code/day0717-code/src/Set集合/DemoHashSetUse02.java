package Set集合;
/*
    给HashSet中存放自定义类型元素时，需要重写对象中的hashCode和equals方法，
    建立自己的比较方式，才能保证HashSet集合中的对象唯一
    要求：
    同名同年龄的人，认为是同一个人，只能存储一次
 */

import java.util.HashSet;

public class DemoHashSetUse02 {
    public static void main(String[] args) {
        //创建一个HashSet集合存储Person
        HashSet<Student> set=new HashSet<>();
        Student p1=new Student("小美女",18);
        Student p2=new Student("小美女",18);
        Student p3=new Student("小美女",19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }
}
