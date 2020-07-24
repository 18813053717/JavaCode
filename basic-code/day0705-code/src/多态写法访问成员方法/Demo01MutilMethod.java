package 多态写法访问成员方法;
/*
在多态的代码当中，成员方法的访问规则是：
    看new的是谁就优先用谁，没有则向上找
口诀：成员方法编译看左边，运行看右边。
     成员变量编译看左边，运行也看左边
 */

public class Demo01MutilMethod {
    public static void main(String[] args) {
        Fu obj=new Zi();
        obj.method();//父子都有，优先用子
        obj.methodFu();//子类没有，父类有

        //obj.methodZi();错误写法左边是Fu类，Fu类中并没有methodZi（）这个Zi类特殊的方法
    }
}
