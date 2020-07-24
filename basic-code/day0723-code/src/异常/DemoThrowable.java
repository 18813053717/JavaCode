package 异常;
/*
    异常本身就是一个类，产生异常就是创建异常对象并抛出了一个异常对象，java处理异常的方式是中断处理
    java.lang.Throwable是所有异常和错误的超类
        Exception:编译期异常，进行编译程序出现的问题
            RuntimeException:运行期异常。程序运行过程中出现的问题
            异常就相当于程序得了一个小毛病，把异常处理掉，程序可以继续执行
        Error：错误
            错误就相当于程序得了一个无法治愈的毛病，必须修改源代码程序才能继续执行
 */



public class DemoThrowable {
    /*
        定义一个方法，获取数组指定索引处的元素
        参数：
            int[] arr
            int index
        以后（工作中）我们首先必须对方法传递过来的参数进行合法性校验
        如果参数不合法，那么我们必须使用抛出异常的方式，告知方法的调用者传递的参数有问题
     */
    public static int getElement(int[]arr ,int index){
        /*
            对传递过来的参数数组进行合法性校验
            如果数组arr的值是null
            那么我们就抛出空指针异常，告知方法的调用者“传递的数组的值是null”
         */


               int num=arr[index];
        return num;
    }
    public static void main(String[] args)/* throws ParseException */{

    }
}
