package Getter和Setter方法;

public class Demo03PrivateUseStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("aaa");
        student.setAge(20);
        student.setMale(true);


        System.out.println("姓名："+student.getName());
        System.out.println("年龄："+student.getAge());
        System.out.println("爷们？"+student.isMale());
    }


}
