package Map接口;
/*
    计算一个字符串中每个字符出现个数
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DemoPractice {
    public static void main(String[] args) {
        //使用Scanner获取用户输入的字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串字符");
        String line = sc.next();

        count(line);
    }
    public static void count(String str){
        //创建一个LinkedHashMap存储数据，key为字符，value为字符的个数
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        //字符串转换为字符数组
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            //字符已经存在，则取出字符的个数然后加1，再存一下
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);

            }
            //字符不存在，存1
            else{
                map.put(array[i],1);
            }
        }
        //entrySet方法遍历集合
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue()+"个");
        }


    }
}
