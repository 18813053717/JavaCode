package 抽象类抽象方法初探;

public class Cat extends Animal {
    //在子类中覆盖重写抽象父类当中所有的抽象方法
    @Override
    public void eat(){
        System.out.println("猫吃鱼");

    }
    @Override
    public void sleep(){
        System.out.println("6hours");

    }
    @Override
    public void game(){
        System.out.println("dnf");

    }
}
