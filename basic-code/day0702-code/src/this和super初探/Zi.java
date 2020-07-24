package this和super初探;

public class Zi extends Fu {
    int num=20;//本类成员变量
    public void method(){
        int num=30;//局部变量
        System.out.println(num);//30 局部变量
        System.out.println(this.num);//20 本类的成员变量
        System.out.println(super.num);//10 父类的成员变量
    }
}
