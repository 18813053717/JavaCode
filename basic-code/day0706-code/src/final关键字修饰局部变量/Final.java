package final关键字修饰局部变量;
/*
一旦使用final关键字对局部变量进行修饰，那么这个变量就不能进行更改，一次赋值，终身不变，只能赋值一次
 */

import final关键字修饰成员变量.Final1;

public class Final {
    public static void main(String[] args) {
        int num1=10;
        System.out.println(num1);

        num1=20;
        System.out.println(num1);
        //保证只赋值一次就可
        final int num2=100;
        final int num3;
        num3=10;
        //num2=1;错误写法，不能再做赋值，num2本质上仍然是一个变量
        System.out.println("===========");
        Final1 one=new Final1();
        one.show();
    }
}
