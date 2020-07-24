package 方法的重写覆盖;

public class Zi extends Fu {
    public void metodzi(){

        System.out.println("子类方法执行");
    }
    @Override
    public void method(){

        System.out.println("子类重名方法执行");
    }
}
