package super关键字的用法;
/*
super关键字的用法有三种
1.在子类中访问父类的成员变量
2.在子类的成员方法中访问父类的成员方法
3.在子类的构造方法中访问父类的构造方法
 */

public class Zi extends Fu {
    int num=20;
    public Zi(){
        super();

    }


    public void methodzi() {
        System.out.println(num);//本类中的num
        System.out.println(super.num);//父类中的num
    }
    public void method(){
        super.method();//访问父类当中的成员方法
        System.out.println("子类方法");
    }
}
