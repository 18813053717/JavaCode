package 父类子类继承初探;
//定义一个父类
public class Employee {
    //定义一个父类成员变量
    int numfu=10;//定义一个父类成员变量
    int num=100;
    public void method(){
        System.out.println("父类成员方法执行");

    }
    public void methodfu(){
        //使用本类当中的num
        System.out.println(num);
    }

}
