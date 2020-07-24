package Map接口;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的第二种遍历方式：通过键值对的方式
    Map集合中的方法：
    Set<K，V> entrySet():返回此映射中包含的键值对视图，得到一个Set集合用来存储Map集合中所有的键值对映射关系


    步骤：
        1.使用Map集合中的方法entrySet()，把Map集合中多个键值对关系取出来，存储到一个Set集合中
        2.遍历Set集合，获取每一个键值对的Entry关系
        3.通过entry.getValue和entry.getKey获取键和值
 */
public class DemoEntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("x",1);
        map.put("y",2);
        map.put("z",3);
        System.out.println(map);
        //使用Map集合中的方法entrySet()，把Map集合中多个键值对关系取出来，存储到一个Set集合中
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {//遍历Set集合，获取每一个键值对的Entry关系
            //通过entry.getValue和entry.getKey获取键和值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
