package 方法覆盖重写小案例;

public class NewPhone extends OldPhone {
    //只对showcall方法进行改动，其余的继承父类即可
    @Override
    public void showcall(){
        super.showcall();//把父类的showcall方法拿来重复利用
        //子类来添加更多内容
        System.out.println("xk");

    }
}
