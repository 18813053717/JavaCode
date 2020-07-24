package 类和对象关系简述及简单实现;

public class Demo02PhoneClassUse {
    public static void main(String[] args) {
        //类名称 对象名=new 类名称（）；
        Phone phone =new Phone();
        //创建一个对象后，首先需要关注该对象的成员变量和成员方法，即该对象有啥属性，该对象能干什么


        System.out.println(phone.brand);
        System.out.println("====");
        phone.brand="iphone";
        System.out.println(phone.brand);


        phone.call("dw");
        phone.sendMessage();
        Phone phone1=phone;//此处没有new一个新对象类，所以新建的对象和原对象是同一个，若new了一个新对象，则新旧对象是相互独立的
        phone1.brand="apple";
        System.out.println(phone.brand);
    }
}
