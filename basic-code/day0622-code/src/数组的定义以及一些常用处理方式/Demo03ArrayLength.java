package 数组的定义以及一些常用处理方式;
/*
获取数组的长度方式：
数组名称.length

数组一旦创建，程序运行期间，长度不可改变
 */
public class Demo03ArrayLength{
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        int len=array.length;
        System.out.println("array的数组长度为"+len);
        System.out.println("==============");


        int[]arrayC=new int[3];//new了一个数组
        System.out.println(arrayC.length);

        arrayC=new int[5];//new了一个新数组
        System.out.println(arrayC.length);

    }
}
