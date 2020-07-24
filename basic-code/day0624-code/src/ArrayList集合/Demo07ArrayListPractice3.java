package ArrayList集合;
/*
题目要求：
定义以
指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@分隔每个元素 */

import java.util.ArrayList;

public class Demo07ArrayListPractice3 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        ArrayListPrint(list);//本质上是集合作为方法的参数
    }
    public static void ArrayListPrint(ArrayList<String > list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i)+"}");
            }

            else {
                System.out.print(list.get(i)+"@");
            }

        }


    }
}
