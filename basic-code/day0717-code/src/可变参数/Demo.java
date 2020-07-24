package 可变参数;
/*
    可变参数：是JDK1.5之后出现的新特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数不确定就可以使用可变参数
    使用格式：定义方法时使用
        修饰符 返回值类型 方法名（数据类型... 变量名）{
            //方法体
        }
    原理：
        底层就是一个数组，根据传递参数的个数不同，会创建不同长度的数组来存储这些参数
        传递的参数个数可以是0个至多个
    注意事项：
        1.一个方法的参数列表只能有一个可变参数
        错误写法：public static void method(int... a,String... b):这个方法中有两个可变参数
        2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
        错误写法：public static void method(int... a,String str, double b);
        正确写法：public static void method(String str,double b,int... a);
    可变参数的特殊（终极）写法
    public static void method(Object...obj){
        //接收任意类型的参数
    }
 */

public class Demo {
    public static void main(String[] args) {
        int sum = sum(1,2,77777777);//调用方法时传递进来n个参数，就会生成一个长度为n的数组，并将参数依次存储
        System.out.println(sum);

    }
    /*//定义一个方法计算两个整数的和
    public static int sum(int a, int b){
        return a+b;
    }
    //定义一个方法计算三个整数的和
    public static int sum(int a, int b,int c){
        return a+b+c;
    }*/
    /*
        定义计算（0-n）整数和的方法
        已知计算整数的和，数据类型已经确定为int
        但是参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数
     */
    public static int sum(int... arr){//底层是一个数组
        //System.out.println(arr);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        return sum;

    }
    /*public static void method(int...a,String...b){
        错误写法
    }*/
    /*public static  void method(int...a,String str){
       错误写法
    }*/
    /*public static void method(String a,int...b){
       正确写法
    }*/
}
