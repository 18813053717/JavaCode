package 方法定义格式及注意事项;
/*
1.方法应该定义在类当中，但是不能在方法当中再定义方法，不能嵌套
2.方法定义的先后顺序无所谓
3.方法定义之后不会执行，如果希望执行，一定要调用
4.如果方法有返回值，那么必须写上“return 返回值”
5.return后面的返回值数据，必须和方法的返回值类型对应起来
6.对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己
7.对于方法当中最后一行的return可以省略不写（前提是必须为void类型）
8.一个方法中可以有多个return语句，但是必须保证同时只有一个会被执行，两个return不能连写
 */
public class Demo03MethodNotice {
    public static void method(){
//        return 10;//错误的写法，方法没有返回值，return后面就不能写返回值
        return;//没有返回值，只是结束方法的执行而已
    }
    public  static void method1(){
        System.out.println("aaa");
        System.out.println("bbb");
        return;//最后一行的return可以省略不写
    }
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }
        else {//有且仅有一个return会被执行
            return b;
        }
    }
}
