package 数组的定义以及一些常用处理方式;
/*
数组元素的反转：
本来的样子:[1,2,3,4]
之后的样子:[4,3,2,1]
数组元素反转就是对称位置元素交换

要求不能使用新数组，就用原来的唯一一个数组进行反转
 */


public class Demo06ArrayReverse {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        System.out.println("反转前：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==========");
        System.out.println("反转后");
        for (int i = 0; i < array.length/2; i++) {//交换的次数为array.length/2
            int temp=array[i];//定义一个中间变量来存放前面的数据
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
