package ArrayList集合;
/*
数组的长度不可以发生改变

Arraylist集合的长度是可以随意变化的
对于Arraylist来说，有一个尖括号<E>代表泛型。
泛型，也就是装在集合当中的所有元素都是统一的什么类型
注意：泛型只能是引用类型，不能是基本类型


注意事项:
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
如果内容是空，得到的的空的中括号[]


ArrayList当中的常用方法：
add(E):向集合当中添加元素，参数的类型和泛型一致，返回值为boolean类型
注意：对于ArrayList集合来说，向集合当中添加元素是一定成功的，所以返回值可用可不用
对于其他集合来说，add添加动作不一定成功，返回值的存在有了意义
get(int index):从集合当中获取元素，参数是索引编号，返回值就是其对应位置的元素，只是读取不删除
remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除的元素
size():获取集合的尺寸长度，返回值就是集合中包含的元素个数
 */

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面装的全是String字符串类型的数据
        ArrayList<String> list =new ArrayList<>();
        System.out.println(list);//对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
        System.out.println("=======");


        //向集合当中添加元素
        boolean success=list.add("hhh");
        list.add("ddd");
        list.add("fff");
        System.out.println(list);
        System.out.println(success);//add方法的返回值为boolean类型，即表示添加元素是否成功
        System.out.println("=======");


        //从集合当中读取元素
        System.out.println(list.get(0));
        System.out.println("======");


        //从集合当中删除元素
        System.out.println(list.remove(0));//通过索引值来删除元素，返回值是被删除的元素
        System.out.println(list.remove("ddd"));//通过删除元素本身来删除，返回值是boolean类型，表示是否删除成功
        System.out.println(list);
        System.out.println("=======");

        //获取集合的长度尺寸，也就是集合当中的元素个数
        System.out.println(list.size());

    }
}
