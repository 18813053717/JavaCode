package 成员内部类;
//如果出现了重名现象，格式: 外部类名称.this.外部变量名

public class Outer {
    int num=10;//外部类的成员变量
    public class iner{//内部类和外部类并不是继承关系
        int num =20;//内部类的成员变量

        public void methodInner(){
            int num=30;//内部类成员方法中的局部变量
            System.out.println(num);//局部变量，就近原则
            System.out.println(this.num);//内部类的成员变量
            System.out.println(Outer.this.num);//外部类的成员变量，由于内部类和外部类并不是继承的关系，所以不能使用super关键字

        }

    }
}
