package 异常.异常的处理;
/*
    try..catch:异常处理的第二种方式：自己处理异常
    格式
        try{
            可能产生异常的代码
        }catch（定义一个异常的变量，用来接收try中抛出的异常对象）{
            异常的处理逻辑，异常对象之后怎么处理
            一般在工作中，会把异常的信息记录在一个日志中
        }
        catch可以有多个
    注意：
        1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
        2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch 中的处理逻辑，继续执行try catch之后的代码
          如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，执行完try中的代码，继续执行try catch之后的代码
 */

import java.io.IOException;

public class DemoTryCatch {
    public static void main(String[] args)  {

        try{
            readFile("c:\\a.tx");
        }catch(IOException e){//try中抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
            //System.out.println("catch-传递的文件后缀不是.txt");
            /*
                throwAble中定义了3个异常处理的方法
                1.String getMessage
                2.String toString
                3.void printStackTrace
             */
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("后续代码");

    }
    public static void readFile(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");


        }
        System.out.println("路径没有问题，读取文件");
    }
}
