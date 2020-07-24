package 接口多态综合案例_USB接口;
/*
鼠标和笔记本电脑没有直接的联系，键盘也和笔记本电脑没有直接的联系，间接通过USB
好处；有了USB接口作为统一规范标准，笔记本电脑只需要把参数写成USB
鼠标键盘只要能实现USB中的功能，就能通用

 */

public class Demo01Main {

    public static void main(String[] args) {
        //首先根据电脑类创建一个电脑对象
        Comuter comuter=new Comuter();
        comuter.powerOn();

        //准备一个鼠标
        //直接进行向上转型，当做USB,多态写法
        //接口名称 对象名称=new 实现类名称（）;
        USB usbMouse=new Mouse();
        comuter.useDevice(usbMouse);

        //创建一个USB键盘,没使用多态写法
        KeyBoard keyBoard =new KeyBoard();
        //useDevice方法参数是USB类型，传递进去的是实现类对象
        comuter.useDevice(keyBoard);//也是正确写法，本质是发生了向上转型，因为KeyBoard类作为USB接口的实现类，所以keyboard本身就是一个USB类型
        //computer.useDevice(new KeyBoard());也是正确写法



        comuter.powerOff();//关机


    }
}
