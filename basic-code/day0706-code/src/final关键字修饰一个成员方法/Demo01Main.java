package final关键字修饰一个成员方法;

public class Demo01Main {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.method();//这个方法在子类中是没有被覆盖重写的，因为父类中对这个方法添加了final关键字，所以调用的是父类当中的方法
    }
}
