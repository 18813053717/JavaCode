package 接口多态综合案例_USB接口;
//这是USB接口的一个实现类，鼠标就是一个USB设备
public class Mouse implements USB {
    //作为接口的实现类，需要覆盖重写接口中所有的抽象方法
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");

    }
    //Mouse类中特有的方法
    public void click(){
        System.out.println("点击鼠标");
    }
}
