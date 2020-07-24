package Object类;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    /*
    object类的equals方法，默认比较的是两个对象的地址值
    重写equals方法，比较两个对象的属性（name，age）
    问题：隐含一个多态
        无法使用子类特有的内容(属性和方法)

     */
    /*@Override
    public boolean equals(Object obj){
       if(obj instanceof Person){
        //使用向下转型，obj转换为Person类型
        Person p=(Person) obj;

        boolean b=this.name.equals(p.name)&&this.age==p.age;
        return b;
       }
        else{
           return false;
       }

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}
