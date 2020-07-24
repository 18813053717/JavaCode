package 成员内部类;
/*
如果一个事物的内部包含另一个事物，这也就是一个类内部包含另一个类
例如：身体和心脏的关系，汽车和发动机的关系，内部类不能独立存在
内部类脱离了外部类无法正常进行工作
内部类分类：
1.成员内部类
2.局部内部类（包含匿名内部类）
成员内部类的定义格式：
修饰符 class 类名称{
    修饰符 class 类名称{
    //
    }
}
注意：内用外，可以随意访问。外用内，需要内部类对象

如何使用成员内部类
1.间接方式：在外部类的方法当中，使用内部类，然后main只是调用外部类的方法
2.直接方式：公式
类名称 对象名=new 类名称（）；
外部类名称.内部类名称 对象名 =new 外部类名称（）.new 内部类名称（）；
 */

public class Demo01InnerClass {
    public static void main(String[] args) {
        //外部类的对象
        Body body =new Body();
        //通过外部类的对象，调用外部类的方法，里面间接使用内部类Heart
        body.methodBody();
        System.out.println("=======================");


        //直接创建内部类的对象
        Body.Heart heart =new Body().new Heart();//想要创建内部类对象，必须先创建外部类对象 
        heart.beat();


        System.out.println("========");
        //直接创建内部类的对象
        Outer.iner obj= new Outer().new iner();
        obj.methodInner();


    }
}
