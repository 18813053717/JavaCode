package 对象的向上转型和向下转型;
/*
对象的向上转型就是父类对象引用指向子类对象
 */

public class Demo01Main {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();//编译看左，运行看右 Animal类中有eat（）方法所以代码正确，实际执行的是Cat类的eat（）方法
        //animal.catchmouse();错误写法，Animal中没有catchmouse方法，但是Cat中确实有这个方法
        //进行还原动作
        Cat cat=(Cat)animal;//最开始是猫，然后被当做动物看待了，最后又给还原成了猫，猫就可以使用继承Animal的方法以及自身独特的方法了
        cat.eat();
        cat.catchmouse();
    }
}
