package String类;
/*
字符串分割：
public String[] split(String regex),按照参数的规则，将字符串切分成若干部分生成一个数组
split方法的参数其实是一个“正则表达式”
如果按照英文句点“.”进行分割，需要写成“”\\.
 */

public class Demo07StringSplit {
    public static void main(String[] args) {
        System.out.println("aaa,bbb,ccc,ddd".split(",")[0]);//aaa
        System.out.println("aaa,bbb,ccc,ccc".split(",").length);//4
        System.out.println("aaa.bbb".split("\\.").length);//2,参数比较特殊

    }
}

