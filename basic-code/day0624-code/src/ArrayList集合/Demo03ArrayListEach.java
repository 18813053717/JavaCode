package ArrayList集合;

import java.util.ArrayList;

public class Demo03ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");


        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
