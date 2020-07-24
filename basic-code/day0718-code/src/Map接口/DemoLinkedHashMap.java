package Map接口;
/*
    HashMap中元素成对，查询速度很快，但是成对元素存放进去是没有顺序的
    LinkedHashmap作为HashMap的子类就是解决这个问题的
 */

import java.util.*;

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        //使用HashMap(无序集合)
        HashMap<String,String> map1=new HashMap<>();
        map1.put("a","a");
        map1.put("c","c");
        map1.put("b","b");
        Set<String> strings = map1.keySet();
        Iterator<String> it = strings.iterator();
        while(it.hasNext()){
            System.out.println(map1.get(it.next()));
        }
        //使用LinkedHashMap（有序集合,存储和取出元素的顺序一致）
        LinkedHashMap<String,String> map =new LinkedHashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
