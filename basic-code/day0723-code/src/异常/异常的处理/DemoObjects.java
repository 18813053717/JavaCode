package 异常.异常的处理;
/*
    Objects类中的静态方法
    若需要对参数进行合法性判断，判断其是否为空，
    可直接使用Objects类中的静态方法requireNonNull()
 */

import java.util.Objects;

public class DemoObjects {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
       /* if(obj==null){
            throw new NullPointerException("传递的对象的值是空");
        }*/
        //Objects.requireNonNull(obj);
        //重载形式
        Objects.requireNonNull(obj,"传递的对象的值是null");
    }
}
