package 数组的定义以及一些常用处理方式;
/*
访问数组元素的格式：数组名称[索引值]
索引值代表数组中元素的编号，从0开始，一直到“数组的长度-1”为止
动态化初始化数组的时候，其中的元素将会自动拥有一个默认值，规则如下：
如果是整数类型，那么默认为0
如果是浮点类型，那么默认为0.0
如果是字符类型，那么默认为‘\u0000’
如果是布尔类型，那么默认为false
如果是引用类型，那么默认为null
 */

public class Demo02ArrayUse {
    public static void main(String[] args) {
        //静态初始化的省略
        int[]array={10,20,30};
        //直接打印数组名称，得到的是数组对应内存地址哈希值
        System.out.println(array);
        //打印数组的第一个元素
        System.out.println(array[0]);
        int num=array[1];
        System.out.println(num);

        //动态初始化一个数组
        int[]arrayA=new int[3];
        System.out.println(arrayA[1]);
        arrayA[1]=3;
        System.out.println(arrayA[1]);


    }
}
