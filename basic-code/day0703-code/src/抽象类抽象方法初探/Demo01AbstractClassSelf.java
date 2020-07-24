package 抽象类抽象方法初探;
/*
抽象方法：
如果父类当中的方法不确定如何进行方法体的实现，那么这就应该是一个抽象方法。

如何使用抽象类和抽象方法
1.不能直接创建new抽象类对象.
2.必须用一个子类来继承抽象父类 extends关键字
3.子类必须覆盖重写抽象父类当中所有的抽象方法
4.创建子类对象进行使用
注意：
1.抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类
2.抽象类的子类，必须重写抽象父类中所有的抽象方法，否则编译无法通过而报错，除非该子类也是抽象类


 */

public class Demo01AbstractClassSelf {
    public static void main(String[] args) {
        Animal cat=new Animal() {//这种定义方法属于匿名内部类，不需要创建抽象类的子类，这种定义跟Cat没关系
            @Override
            public void eat() {
                System.out.println("鱼");
            }

            @Override
            public void sleep() {
                System.out.println("6hour");

            }

            @Override
            public void game() {
                System.out.println("dnf");

            }
        };
        cat.normal();
        cat.eat();
        cat.sleep();
        cat.game();
        Animal dog =new Animal() {
            @Override
            public void eat() {

            }

            @Override
            public void sleep() {

            }

            @Override
            public void game() {

            }
        };
    }
}


