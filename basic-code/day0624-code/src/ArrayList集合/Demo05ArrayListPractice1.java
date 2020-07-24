package ArrayList集合;
/*题目要求
生成6个1-33之间的随机整数，添加到集合，并遍历集合
 */

import java.util.ArrayList;
import java.util.Random;

public class Demo05ArrayListPractice1 {
    public static void main(String[] args) {
        //创建Random对象
        Random r=new Random();
        //创建ArrayList集合，泛型为Integer
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            //生成1-33之间的随机整数
            int num=r.nextInt(33)+1;
            //添加到集合
            list.add(num);

        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
