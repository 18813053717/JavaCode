package Set集合;
/*
    哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到地址，不是数据实际存储的物理地址）
    在Object类有一个方法int hashcode可以获取对象的哈希值,也就是对象的地址值

     注意：给HashSet中存放自定义类型元素时，需要重写对象中的hashCode和equals方法
 */
public class HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1=new Person();
        System.out.println(p1);
        System.out.println(p1.hashCode());
        Person p2=new Person();
        System.out.println(p2);
        System.out.println(p2.hashCode());//对象的逻辑地址是一样的
        System.out.println(p1==p2);//对象的物理地址是不一样的




    }
}
