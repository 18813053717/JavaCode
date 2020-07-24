package 匿名对象;

import java.util.Scanner;

public class Demo02AnonymousObjectAsPara {
    public static void main(String[] args) {
        //普通使用方式
        //Scanner sc=new Scanner(System.in);
        //int num1=sc.nextInt();

        //匿名对象的方式
        //int num2=new Scanner(System.in).nextInt();
        //System.out.println("输入的是："+num2);
        //使用匿名对象来进行传参
        //methodParam(new Scanner(System.in));
        //使用匿名对象作为返回值
        Scanner sc=methodReturn();
        int num =sc.nextInt();
        System.out.println("输入的数字为："+num);
    }


    public static void methodParam(Scanner sc){
        int num=sc.nextInt();
        System.out.println("输入的数字是:"+num);

    }



    public static Scanner methodReturn(){

        return new Scanner(System.in);
    }
}
