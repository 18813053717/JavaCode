package JDK9对集合添加的优化;
/*
    JDK9的新特性
        List接口，Set接口,Map接口：里面增加了一个静态的方法of，可以给集合一次性添加多个元素
        static <E> list <E> of (E element)
    使用前提：当集合中存储的元素的个数已经确定，不再改变时使用
    注意：1.of方法只应用于List接口，Set接口,Map接口，不适用于接口的实现类
         2.of方法的返回值是一个不能改变的集合，集合不能再使用add/put方法
         3.Set接口和Map接口在调用of方法的时候，不能有重复的元素
 */

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        System.out.println(list);

        Set<Integer> integers = Set.of(1, 2, 3, 4);
        System.out.println(integers);

        Map<String, Integer> stringIntegerMap = Map.of("1", 1,"2",2);
        System.out.println(stringIntegerMap);
    }
}
