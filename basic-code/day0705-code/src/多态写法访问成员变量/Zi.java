package 多态写法访问成员变量;

public class Zi extends Fu{
    int num=20;
    int age=16;
    @Override
    public void show(){
        System.out.println("zilei"+num);

    }
    public void showmepower(){
        System.out.println("power");
    }
}
