package Map接口;
/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的：
        作为key的元素，必须重写hashCode方法和equals方法，来保证其唯一性
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
    public static void main(String[] args) {
        show01();
        show02();
    }


    /*
        HashMap存储自定义类型键值
        key：String类型
            String类重写HashCode方法和保证key唯一
        value：Person类型
            value可重复（同名同年龄 的人视为同一个）
     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String,Person> map=new HashMap<>();
        //往集合中添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));//覆盖
        //使用keySet便利集合
        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(s+":"+map.get(s));
        }

    }
    /*
        HashMap存储自定义类型键值
        key：Person类型
            Person类需要重写HashCode方法和保证key唯一
        value：String类型
            可重复
     */
    private static void show02() {
        HashMap<Person,String> map=new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("始皇帝",18),"秦国");
        map.put(new Person("普大帝",18),"俄国");
        map.put(new Person("女王",18),"美国");//若不在Person类中重写hashcode和equals方法就会出现键冲突
        //使用entrySet遍历集合
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

}
