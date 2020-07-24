package Map接口;
/*
    Map集合的第一种遍历方式：通过键找值的方式
    Map集合中的方法：
    Set<K> keyset():返回此映射中包含的键的Set视图，时间得到一个Set集合用来存储Map集合中所有的键
    有了键然后通过Map集合中的get（Object key）方法获取键对应的值

    步骤：
        1.使用Map集合中的方法keySet()，把Map集合中所有的key取出来，存储到一个Set集合中
        2.遍历Set集合，获取Map集合中每一个key
        3.通过Map集合中的get方法，通过key找到value
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoKeySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("x",1);
        map.put("y",2);
        map.put("z",3);
        //System.out.println(map);
        //使用Map集合中的方法keySet()，把Map集合中所有的key取出来，存储到一个Set集合中
        Set<String> str = map.keySet();
        System.out.println(str);
        //遍历Set集合，获取每一个key（s）
        for (String s : str) {
            //通过get方法由key获取value
            System.out.println(map.get(s));

        }

    }
}
