package 接口多态综合案例_USB接口;
//Computer类只是一个普通类，而不是USB接口的实现类
public class Comuter {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }
    //使用usb设备的方法,使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();//打开设备，假设当传入的参数是usbMouse时，成员方法运行看右边，右边是Mouse类，所以open（）是用的Mouse类中覆盖重写的那个
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.click();
        }else if(usb instanceof KeyBoard){
            KeyBoard keyBoard =(KeyBoard)usb;
            keyBoard.type();
        }
        usb.close();//关闭设备
    }
}
