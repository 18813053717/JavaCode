package 多态写法访问成员方法;

public class Zi extends  Fu {
    @Override
    public void method(){
        System.out.println("子类方法");
    }
    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
