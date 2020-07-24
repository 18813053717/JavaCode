package 对象的向上转型和向下转型;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    //Cat类特有方法
    public void catchmouse(){
        System.out.println("猫抓老鼠");

    }
}
