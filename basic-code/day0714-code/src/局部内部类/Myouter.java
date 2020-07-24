package 局部内部类;
/*
局部内部类，如果想要访问所在方法的局部变量，那么这个局部变量必须是有效final的，保证局部变量事实不变，final关键字可以省略
 */

public class Myouter {

    public void methodOuter(){

        int num=10;//所在方法的局部变量
        //num =20;
        class MyInner{
            public void methodInner(){
                System.out.println(num);

            }


        }
    }
}
