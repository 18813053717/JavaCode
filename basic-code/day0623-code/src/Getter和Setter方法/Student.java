package Getter和Setter方法;

public class Student {
    private String name;//姓名
    private int age;//年龄
    private boolean male;//是不是男的
    //boolean类型的get和别的数据类型不一样，反正能自己生成
    public void setMale(boolean b){
        male=b;
    }
    public boolean isMale(){
        return male;
    }


    public void setName (String str){
        name=str;
    }
    public String getName(){
        return name;
    }


    public void setAge(int num){
        age=num;
    }
    public  int getAge(){
        return  age;
    }
}
