package Static关键字修饰成员变量和成员方法;
/*
一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类的

如果没有static关键字，必须首先创建对象，然后通过对象才可以使用
如果有了static关键字，那么不需要创建对象，直接能通过类名称来使用它


总结：
无论是成员变量还是成员方法，如果有了static，都推荐使用类名称进行调用
静态变量：类名称.成员变量
静态方法：类名称.静态方法（）


注意：
1.静态只能直接访问静态，不能直接访问非静态
因为内存中先有的静态内容，后有的非静态内容
2.静态方法当中不能用this关键字，因为this代表当前对象，静态方法和对象一点关系都没有
 */

public class Demo02StaticMethod {
    public static void main(String[] args) {
        //首先需要创建对象
        MyClass OBJ=new MyClass();
        //然后才能通过对象调用成员方法
        OBJ.method();

        //对于静态方法来说直接通过类名称进行调用
        MyClass.methodstatic();

        //对于本类当中的静态方法，可以省略类名称
        method();
    }
    public static void method(){
        System.out.println("1111");
    }
}
