package ArrayList集合;
/*
题目要求：
定义一个数组，用来存储3个Person对象

数组有一个缺点，一旦创建，程序运行期间长度不可以发生改变

对象数组和常规数组的区别：
常规数组:数组中元素的类型必须是一致的，如只能是int类型
int[]array1=new int[3];
对象数组：数组中的每一个元素都是一个对象，而对象本身的成员变量是多样的
Person[]array2=new Person[3];


但是不论是常规数组还是对象数组都有一个缺点，那就是一旦创建数组，程序运行期间长度不可改变
因此需要考虑Dem02中的ArrayList
 */

public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[]array=new Person[3];
        //创建三个对象
        Person one=new Person("111",22);
        Person two=new Person("222",33);
        Person three=new Person("333",44);

        //存储对象
        array[0]=one;
        array[1]=two;
        array[2]=three;

        //输出地址值,array[0]代表其中的一个person对象，想要使用对象中的成员变量和成员方法还需要继续.才可以
        System.out.println(array[0]);//此时打印出来的是对象的地址值

        //使用对象数组

        System.out.println(array[1].getName()+" "+array[1].getNum());
    }
}
