package 泛型;

public class Demo01GenericClass {
    public static void main(String[] args) {
        /*
        原始的使用方法,这样的话对于name变量只能使用字符串
         */
        //GeneriClass gc=new GeneriClass();
        //gc.setName("只能是字符串");
        /*
        使用泛型之后
         */
        //在创建对象时确定泛型的数据类型为String
        GeneriClass<String> gc1=new GeneriClass<>();
        gc1.setName("ddddddddddd");//只对写成泛型的name变量有影响，对之前已经确定的int类型变量age没影响
        System.out.println(gc1.getName());
        gc1.setAge(1111);

        System.out.println(gc1.getAge());
        //在创建对象时确定泛型的数据类型为Integer
        GeneriClass<Integer> gc2=new GeneriClass<>();
        gc2.setName(1);
        System.out.println(gc2.getName());
        gc2.setAge(777);
        System.out.println(gc2.getAge());


    }
}
