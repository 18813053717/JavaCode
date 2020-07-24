package Object类;

public class Demo01Equals {
    public static void main(String[] args) {
        Person p1 =new Person("迪丽热巴",18);
        Person p2 =new Person("马尔扎哈",19);
        System.out.println("p1:"+p1);
        System.out.println("p2:"+p2);//地址值
        //System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p2));
    }
}
