package Static关键字修饰成员变量和成员方法;

public class Student {
    private  int id;
    private String name;
    private int age;
    static String room;
    static private int idCounter=0;//学号计数器，每当new了一个新对象之后，idCounter++

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Student() {
        this.id=idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;
    }
}
