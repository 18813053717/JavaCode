package 方法定义格式及注意事项;
/*
定义方法的完整格式
 修饰符 返回值类型 方法名称（参数类型 参数名称...）{
    方法体
    return 返回值
 }
修饰符：现阶段的固定写法 public static
返回值类型：也就是方法最终产生的数据结果是什么类型
方法名称：也就是方法的名字
参数类型：进入方法的数据是什么类型
参数名称：进入方法的数据是什么名称
PS:参数如果有多个则使用,分割
方法体：方法需要做的事情，包含若干行代码
return：两个作用，第一停止当前方法，第二将后面的结果数据返回值返回给调用处
返回值：也就是方法执行后最终产生的数据结果
PS：return后面的返回值类型必须和方法名称前的返回值类型对应
任何数据类型都能作为方法的参数类型，或者返回值类型
 */

public class Demo02MethodDefine {
    //主方法psvm
    public static void main(String[] args) {
        int sum=sum(2,3);
        //打印输出语句
        System.out.println(sum);


    }

    //定义一个静态方法: 两个int数字相加的方法

    public static int sum(int num1,int num2){
        int sum=num1+num2;

        return sum;

    }


}
