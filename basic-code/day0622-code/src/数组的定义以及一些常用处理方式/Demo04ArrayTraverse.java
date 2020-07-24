package 数组的定义以及一些常用处理方式;


/*
数组遍历：对数组当中的每一个元素进行逐一处理，默认的处理方式就是打印输出
 */
public class Demo04ArrayTraverse {
    public static void main(String[] args) {
        int[]array={15,25,35,45};
        //原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println("======");
        //使用循环
        int len=array.length;
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);

        }
        System.out.println("==========");
        //最简便写法：array.length.fori
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}

