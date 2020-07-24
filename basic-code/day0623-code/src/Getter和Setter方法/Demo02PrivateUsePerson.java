package Getter和Setter方法;

public class Demo02PrivateUsePerson {
    public static void main(String[] args) {
        Person person=new Person();//依据Person类创建一个新的对象person
        person.show();
        person.name="aa";
        //person.age=15;直接访问private内容是错误的方法
        person.setAge(20);//通过setAge方法改变private类型成员变量的值
        person.show();
        int age=person.getAge();//通过getAge方法获取private类型成员变量的值
        System.out.println(age);


    }
}
