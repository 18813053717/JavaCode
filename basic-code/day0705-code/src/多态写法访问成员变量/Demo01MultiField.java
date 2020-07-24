package 多态写法访问成员变量;
/*
访问成员变量的两种方式：
1.直接通过对象名称访问，看等号左边是谁优先用谁，没有则向上找

2.间接通过成员方法访问,看该方法属于谁优先用谁，没有则向上找

对于成员变量来说，编译看左边，运行也看左边
对于成员方法来说，编译看左边，运行则看右边

 */

public class Demo01MultiField {
    public static void main(String[] args) {
        Fu obj=new Zi();
        System.out.println(obj.num);//=左边是Fu，所以这个num应该是Fu类里的num
        //System.out.println(obj.age);=左边是Fu,Fu类中并没有age变量
        System.out.println("========");
        obj.show();//如果子类当中没有覆盖重写，则找父类的，子类如果覆盖重写，则找子类的
        //obj.showmepower();错误原因，对于成员方法来说，编译看左边，左边是Fu，showmepower方法是子类特有的方法，父类中并没有，所以会报错
    }
}
