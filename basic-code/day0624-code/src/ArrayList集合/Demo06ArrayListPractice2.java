package ArrayList集合;
/*
题目要求：
自定义4个学生对象，添加到集合，并遍历
 */

import java.util.ArrayList;

public class Demo06ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        Person stu1=new Person("小明",2);
        Person stu2=new Person("小黄",5);
        Person stu3=new Person("小绿",4);
        Person stu4=new Person("小白",8);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getName()+"  ");
            System.out.println(list.get(i).getNum());

        }


    }
}
