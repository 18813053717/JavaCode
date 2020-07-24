package 异常.异常的处理;
/*
    finally:有一些代码块无论异常是否发生，都需要执行，由于异常会引发程序跳转，导致有些语句执行不到
    finally就是解决这个问题的，在finally代码块中存放的代码都是一定会被执行的
    什么时候的代码必须最终执行？
    当我们在try语句块中打开了一些物理资源（磁盘文件/网络连接/数据库连接等）我们都得在使用完之后最终关闭打开的资源

    使用格式：
    try{
    }catch{
    }finally{
    }
    注意事项：
        1.finally不能单独使用，必须和try一起使用
        2.finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放（IO）
 */

import java.io.IOException;

public class DemoFinally {
    public static void main(String[] args) {
        try {
            //可能产生异常的代码
            readFile("c:\\a.tx");
        } catch (IOException e) {
            //异常的处理逻辑
            e.printStackTrace();
        }finally {
            //无论是否出现异常都会执行
            System.out.println("资源释放");
        }


    }
    public static void readFile(String fileName) throws IOException {

        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
