package 基本类型包装类;
/*
    自动装箱与自动拆箱：基本类型的数据和包装类之间可以自动的相互转换
 */

import java.util.ArrayList;

public class Auto {
    public static void main(String[] args) {
        /*
        自动装箱:直接把int类型的整数赋值给包装类
         */
        Integer in=1;
        /*
        自动插箱:in是包装类，无法直接参与运算，可以自动转换为基本数据类型，再进行计算

         */
        in=in+2;
        System.out.println(in);
        /*
        ArrayList集合不能直接存储整数，可以存储Integer包装类
         */
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);//自动装箱相当于list.add(new Integer(1))

        int i=list.get(0);//自动拆箱相当于int i =list.get(0).intvalue();

    }
}
