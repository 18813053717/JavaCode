package 接口作为方法的参数;
/*
java.util.list正是ArrayList所实现的接口

 */

import java.util.ArrayList;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list =new ArrayList<>();
        List<String> list1=addName(list);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }

    }
    //采用接口作为方法的参数
    public static List<String> addName(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎吗");
        return list;
    }
}


