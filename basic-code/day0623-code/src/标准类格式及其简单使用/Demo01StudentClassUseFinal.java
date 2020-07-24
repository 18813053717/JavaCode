package 标准类格式及其简单使用;

public class Demo01StudentClassUseFinal {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("哈哈");
        stu1.setAge(11);
        System.out.println("姓名:"+stu1.getName()+",年龄："+stu1.getAge());
        System.out.println("=============");
        Student stu2=new Student("嘎嘎",12);
        System.out.println("姓名:"+stu2.getName()+",年龄："+stu2.getAge());
        stu1.setAge(22);
        System.out.println("姓名:"+stu1.getName()+",年龄："+stu1.getAge());

    }
}
