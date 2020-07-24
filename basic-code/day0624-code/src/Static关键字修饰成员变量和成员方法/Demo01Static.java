package Static关键字修饰成员变量和成员方法;
/*
static静态关键字
假定创建一个类，通过类创建多个对象，
对于对象中的大多数成员变量，每个对象都有自己独立的数据：成员变量
但对于少数成员变量而言，多个对象可能共享同一份数据：静态变量
只在类中保存一份，那所有对象共享同一份

一旦使用了static关键字，那么这样的内容不再属于对象自己，而是属于类的，所以凡是本类的对象，都共享同一份
在调用静态变量或者静态方法时不需要创建对象来进行调用，直接通过类名称来调用即可


/static关键字修饰成员变量：
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享同一份数据
 */

public class Demo01Static {
    public static void main(String[] args) {
        Student one=new Student("国境",1);
        Student two=new Student ("黄荣",2);
        one.room="101";//改变第一个对象的用static修饰的成员变量值（一荣俱荣，一损俱损）

        System.out.println("姓名："+one.getName()+"年龄"+one.getAge()+"学号"+one.getId());
        System.out.println("姓名："+two.getName()+"年龄"+two.getAge()+"学号"+two.getId());
        System.out.println(two.room);//第二个对象的用static修饰的成员变量值跟随第一个对象的改变而改变
    }
}
