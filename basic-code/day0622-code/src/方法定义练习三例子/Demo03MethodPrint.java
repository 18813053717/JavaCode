package 方法定义练习三例子;
/*
要求：定义一个方法，用来打印指定次数的HelloWorld
 */

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);

    }
    public static void printCount(int a){
        for(int i=0;i<a;i++){
            System.out.println("HelloWorld");

        }

    }
}
