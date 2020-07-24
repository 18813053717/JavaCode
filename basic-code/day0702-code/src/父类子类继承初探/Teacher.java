package 父类子类继承初探;
//定义了一个员工的子类
public class Teacher extends Employee {
    //定义一个子类成员变量
    int numzi=20;
    int num=200;
    public void methodzi(){
        //因为本类当中有num，所以这里用的是本类的
        System.out.println(num);

    }

}
