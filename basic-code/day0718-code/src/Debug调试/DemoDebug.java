package Debug调试;
/*
    Debug调试程序：
        可以让代码逐行执行，查看代码执行的过程，调试程序中出现的bug
    使用方式：
        在行号的右边鼠标左键单击添加断点（哪里有bug添加到哪里）
        右键选择debug执行程序
    执行程序：
        f8：逐行执行程序
        f7：进入到方法中
        shift+f8：跳出方法
        f9：跳到下一个断点，如果没有下一个断点，那么就结束程序
        ctrl+f2:退出debug模式，停止程序
        Console：切换到控制台

 */

public class DemoDebug {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }
}
