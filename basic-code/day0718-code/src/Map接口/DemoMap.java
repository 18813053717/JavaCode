package Map接口;
/*
Collection集合与Map集合不同
Collection集合是单列集合，有一个泛型，Map集合是双列集合，有两个泛型
Collection中的集合，元素是孤立存在的，向集合中存储元素采用一个一个元素的方式存储
Map中的集合：元素时成对存在的，每个元素由键与值两部分组成，通过键可以找所对应的值
public interface Map <K,V>
将键映射到值的对象，一个映射不能包含重复的键，每个键最多只能映射到一个值
对于Map集合需要掌握：
    1.Map集合特点
    2.使用Map集合添加方法保存数据
    3.使用“键找值”的方式遍历Map集合
    4.使用“键值对”的方式遍历Map集合
    5.能够使用HashMap存储自定义键值对的数据
    6.能够使用HashMap编写斗地主洗牌发牌案例


    Map集合特点：
        1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
        2.Map集合中的元素，key和value的数据类型可以相同，也可以不相同
        3.Map集合中的元素，key是不允许重复的，value是可以重复的
        4.Map集合中的元素，key和value是一一对应的

 */

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        //创建Map对象
        Map<String,String> map=new HashMap<>();
           /*
        public V put(K key, V value):把指定的键与指定的值添加到Map集合中
        返回值：v
            存储键值对的时候，key不重复，返回值v是null（创建新的）
            存储键值对的时候，key重复，会使用新的value替换map中重复的value值，并返回被替换的value值
            */
        String s1 = map.put("阿珍", "阿强");//第一次出现键“阿珍”，所以返回值为null
        System.out.println(s1);
        String s2 = map.put("阿珍", "小强");//键“阿珍”之前已经存在，本次操作实际为替换，返回“阿珍”之前对应的“阿强”
        System.out.println(s2);

        map.put("杨过","小龙女");
        map.put("尹志平","小龙女");//key不可以重复，但是value值并不限制
        System.out.println(map);
        System.out.println("=====");
         /*
        public V remove(Ogject key):把指定的键值对应元素，在Map集合中删除，返回被删除元素的值
            返回值：v
                key存在，v返回被删除的值
                key不存在，返回null
          */
        String s = map.remove("尹志平");
        System.out.println(s);//返回的是“尹志平”对应的value值
        String s3 = map.remove("168");
        System.out.println(s3);//没有“168”，返回null
        System.out.println(map);//集合中键值对被删除
        System.out.println("=====");
        /*
            public V get(Object key):根据指定的键，在Map集合中获取对应的值
            返回值：v
                key存在，v返回key对应的value值
                key不存在，v返回null
         */
        String s4 = map.get("阿珍");
        System.out.println(s4);//返回“阿珍”对应的“小强”
        String s5 = map.get("尹志平");//没有“尹志平"所以返回null
        System.out.println(s5);
        System.out.println(map);
        System.out.println("=====");
        /*
            boolean contasinsKey(Object key):判断是否存在指定的键
            包含：返回true
            不包含：返回false
         */
        boolean key = map.containsKey("杨过");
        System.out.println(key);
        boolean key1 = map.containsKey("尹志平");
        System.out.println(key1);
    }







}
