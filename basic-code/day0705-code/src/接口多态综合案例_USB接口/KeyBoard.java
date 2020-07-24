package 接口多态综合案例_USB接口;
//USB接口的第二个实现类，键盘就是一个USB设备
public class KeyBoard implements USB {
    //作为接口的实现类，需要覆盖重写接口中全部的抽象方法
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");

    }
    //Keyboard类中特有的方法
    public void type(){
        System.out.println("打字");
    }
}
