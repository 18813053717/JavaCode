package 构造方法;
//多样的构造方法可以将现有的数据以更加方便的形式放入对象中
public class Demo02ConstructorMethod {
    public static void main(String[] args) {
        Student stu=new Student();//采用的是无参构造方法，这样构造出来的对象的成员变量是默认值
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println("========");
        Student stu1=new Student("dw",1);//采用的是全参构造方法，这样构造出来的对象的成员变量是赋予的
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());

    }
}
