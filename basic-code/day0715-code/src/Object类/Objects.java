package Object类;

public class Objects {
    public static void main(String[] args) {
        String s1=null;
        //String S1=null;null是不能调用方法的，会出现空指针异常
        String s2="aBc";
        //boolean b = s1.equals(s2);


        /*
        Objects类中的equals方法：对两个对象进行比较，防止空指针异常
         */
        boolean b=java.util.Objects.equals(s1,s2);
        System.out.println(b);

    }
}
