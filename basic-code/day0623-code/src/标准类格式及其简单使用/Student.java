package 标准类格式及其简单使用;
/*
一个标准的类通常要满足下面4个组成部分
1.所有的成员变量都要使用private关键字修饰
2.为每一个成员变量编写一对儿Getter Setter方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法

在编写代码时只需要完成第一步
点击code->generate->Constractor来生成构造方法
点击code->generate->Getter and Setter来生成Getter Setter方法


这样标准的类也叫做Java Bean
 */
public class Student {
    //成员变量
    private String name;//姓名
    private int age;//年龄
    //Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //无参数的构造方法
    public Student() {
    }
    //全参数的构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

