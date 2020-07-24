package 构造方法;

public class Demo01ThisKeyword {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="你爹";
        person.sayHello("儿砸");//通过person调用的sayHello方法，故person对象即为this，person.name等价于this.name
    }
}
