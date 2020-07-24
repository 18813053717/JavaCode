package 抽象类进阶;
//父亲辈类，仍然是一个抽象类
public abstract class Dog extends Animal {
    //只处理了一个抽象方法，仍然存在抽象方法
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
    //public abstract void sleep()没有进行处理，想当于此类中仍然存在抽象方法，所以此类是一个抽象类，需要加abstract
}
