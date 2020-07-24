package 斗地主案例双列;
/*
    具体规则：
    1.组成54张扑克牌
    2.54张牌顺序打乱
    3.三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张牌留作底牌
    4.查看三人各自手中的牌（按照牌的大小顺序排序），底牌
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DemoStudy {
    public static void main(String[] args) {
        //1.准备牌
        //创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer,String> poker= new HashMap<>();
        //创建一个List集合存储牌的索引
        ArrayList<Integer> indexs=new ArrayList<>();
        //定义两个集合，存储花色和牌的序号
        List<String> colors = List.of("♠", "♥", "♣", "♦");//使用List.of方法创建后，大小不可改变
        List<String> nums = List.of("2", "A", "k", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //定义一个牌的索引
        //先把大王和小王存储到集合中
        int index=0;
        poker.put(index,"大王");//牌集合
        indexs.add(index);//索引集合
        index++;
        poker.put(index,"小王");
        indexs.add(index);
        index++;
        //循环遍历两个集合，组装成52张牌
        for (String num : nums) {
            for (String color : colors) {
                poker.put(index,color+num);//牌集合
                indexs.add(index);//索引集合
                index++;
            }
        }
        //System.out.println(poker);
        //System.out.println(indexs);

        //2.洗牌
        Collections.shuffle(indexs);
        //System.out.println(indexs);

        //3.发牌
        //定义4个集合存储玩家牌的索引和底牌的索引
        ArrayList<Integer> player01=new ArrayList<>();
        ArrayList<Integer> player02=new ArrayList<>();
        ArrayList<Integer> player03=new ArrayList<>();
        ArrayList<Integer> rest=new ArrayList<>();
        for (int i = 0; i < indexs.size(); i++) {
            //获取每一个索引
            Integer in = indexs.get(i);
            if(i>=51){
                rest.add(in);
            }
            else if(i%3==0){
                player01.add(in);
            }
            else if(i%3==1){
                player02.add(in);
            }
            else{
                player03.add(in);
            }
        }
        //4.对牌进行排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(rest);

        //5.看牌
        watch("张三",player01,poker);
        watch("李四",player02,poker);
        watch("王五",player03,poker);
        watch("底牌",rest,poker);

    }

    /*
     定义一个看牌的方法
     */
    public static void watch(String name,ArrayList<Integer> list,HashMap<Integer,String> map){
        System.out.print(name+":");
        //遍历索引集合
        for (Integer it : list) {
            String pok = map.get(it);
            System.out.print(pok+" ");
        }
        System.out.println();


    }
}
