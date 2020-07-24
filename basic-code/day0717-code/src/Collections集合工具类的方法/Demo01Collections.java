package Collections集合工具类的方法;
/*
    java.util.Collections是集合工具类，用来对集合进行操作
    注意：
        如何要对存储自定义类型数据进行排序
        方法1：
        自定义类实现Comparable接口，重写接口中的方法compareTo定义排序的规则

        Comparble接口排序规则
            自己（this）-参数：升序
            参数-自己（this）：降序
        方法2：
        采用第三方比较方法：public static <T> void sort(List<T> list,Comparator<? super T>):将集合中元素按照指定规则排序
        Comparator排序规则：
            o1-o2:升序
            o2-o1:降序
        参考格式：
             Collections.sort(list3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//降序
                //return o1-o2;//升序
            }
        });

    Comparator和Comparable的区别
        Comparable：自己（this）和别人（参数）比较，自己需要实现Comparable接口，重写compareTo比较规则
        Comparator：相当于找一个第三方的裁判来比较两个人
    感觉Comparator更好用一些


 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String>list =new ArrayList<>();
      /*  //常规方法往集合中添加多个元素
        list.add("a");
        list.add("b");
        list.add("c");*/

        //public static<T>boolean addAll(Collection<T> c,T...elements):往集合中添加多个元素(可变参数，T代表未知待定数据类型)
        Collections.addAll(list,"111111","122222","ddddd");
        System.out.println(list);
        System.out.println("=====");

        //public static void shuffle(List<?> list):打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("=====");

        //public static <T> void sort(List<> list):将集合元素按照默认规则排序(升序)
        ArrayList<Integer> list1=new ArrayList<>();
        Collections.addAll(list1,1,5,3,6,7,8,9);
        System.out.println(list1);
        //默认进行升序排序
        Collections.sort(list1);
        System.out.println(list1);
        //对集合进行翻转，得到的是降序排序
        Collections.reverse(list1);
        System.out.println(list1);
        System.out.println("======");
        //定义一个集合用来存储自定义类型
        ArrayList<Person> list2=new ArrayList<>();
        Person p1=new Person("王",10);
        Person p2=new Person("李",7);
        Person p3=new Person("孙",8);
        Collections.addAll(list2,p1,p2,p3);
        System.out.println(list2);
        //重写了compareTo方法，本处采用对年龄的降序排序
        Collections.sort(list2);
        System.out.println(list2);

        //采用第三方比较方法
        ArrayList<Integer> list3=new ArrayList<>();
        Collections.addAll(list3,1,2,3);
        System.out.println(list3);
        Collections.sort(list3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1-o2;//升序
                return o2-o1;//降序
            }
        });
        System.out.println(list3);

        ArrayList<Student> list4=new ArrayList<>();
        Student stu1=new Student("b王",9);
        Student stu2=new Student("李",8);
        Student stu3=new Student("孙",10);
        Student stu4=new Student("a李",9);
        Collections.addAll(list4,stu1,stu2,stu3,stu4);
        System.out.println(list4);
        Collections.sort(list4, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result=o1.getAge()-o2.getAge();
                return o1.getAge()-o2.getAge();//只对年龄进行升序排列
            }
        });
        System.out.println(list4);
        //组合排序
        Collections.sort(list4, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result=o1.getAge()-o2.getAge();
                //如果两个人年龄相同，则使用姓名的首字母进行升序排序，否则使用年龄进行升序排序
                if (result==0){
                    return o1.getName().charAt(0)-o2.getName().charAt(0);//对名字的首字母进行升序升序

                }
                else{
                    return result;//对年龄进行升序排序
                }
            }
        });
        System.out.println(list4);



    }
}
