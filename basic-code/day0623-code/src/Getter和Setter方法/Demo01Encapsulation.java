package Getter和Setter方法;
/*
面向对象三大特征：封装、继承、多态
封装性在Java当中的体现：
1.方法就是一种封装
2.关键字private也是一种封装



封装就是讲一些细节信息隐藏起来，对于外界不可见
 */

public class Demo01Encapsulation {
    public static void main(String[] args) {
        int []array={5,15,25,100};
        int max=getmax(array);//main函数只管调用方法就可以了，而不关心方法内部具体的实现形式

        System.out.println(max);
    }
    //将具体的实现步骤封装成为一个方法
    public static int getmax(int[] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;

    }
}

