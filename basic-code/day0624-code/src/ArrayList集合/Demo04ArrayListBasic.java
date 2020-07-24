package ArrayList集合;
/*
解决集合中存储基本类型数据的方法，必须使用基本类型对应的包装类,相当于一个伪装

基本类型   包装类（引用类型，包装类都位于java.lang包下）
byte       Byte
short      Short
int        Integer
Long       Long
floot      Floot
double     Double
char       character
boolean    Boolean
 */

import java.util.ArrayList;

public class Demo04ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA=new ArrayList<>();
        //错误写法，泛型只能是引用类型，不能是基本类型
        //ArrayList<int> listB=new ArrayList<>();
        //定义一个集合存储int类型数据
        ArrayList<Integer> listB=new ArrayList<>();
        listB.add(100);
        listB.add(200);
        System.out.println(listB.get(0));
        System.out.println(listB.remove(1));
    }
}
