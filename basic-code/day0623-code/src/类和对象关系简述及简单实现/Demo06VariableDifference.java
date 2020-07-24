package 类和对象关系简述及简单实现;
/*
局部变量和成员变量的区别：
1.定义的位置不一样
局部变量：定义在方法的内部
成员变量：定义在方法的外部，直接写在类当中
2.作用范围不一样
局部变量：只有方法当中才可以使用，出了方法就不能再用
成员变量：整个类全都可以通用
3.默认值不一样
局部变量：没有默认值，若想使用，必须手动进行赋值
成员变量：如果没有赋值，会有默认值，规则和数组一样



 */

public class  Demo06VariableDifference {
    String name;//成员变量
    public void methodA(){
        int num=20 ;//局部变量
        System.out.println(num);
        System.out.println(name);//成员变量可以使用
    }
    public void methodB(){
        //System.out.println(num);methodB成员方法中不能使用methodA当中定义的局部变量
        System.out.println(name);//成员变量可以使用
    }
}
