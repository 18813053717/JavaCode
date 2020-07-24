package ArrayList集合;
/*题目要求：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
要求使用自定义的方法来实现筛选
 */


import java.util.ArrayList;
import java.util.Random;

public class Demo08ArrayListPractice4 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(21));
        }
        System.out.println(list);
        System.out.println("==========");
        ArrayList<Integer> list2=select(list);
        System.out.println(list2);

    }
    public static ArrayList<Integer> select(ArrayList<Integer> list){
        ArrayList<Integer> list1=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if(list.get(i)%2==0){
                list1.add(list.get(i));
            }

        }
        return list1;


    }
}
