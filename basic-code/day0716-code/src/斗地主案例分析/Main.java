package 斗地主案例分析;
/*
    1.准备牌：54张牌，存储到一个集合中
    特殊牌：大王，小王
    其余52张牌：
              定义一个数组/集合，存储4种花色
              定义一个数组/集合，存储13个序号
    循环嵌套遍历两个数组/集合，组成52张牌
    2.洗牌：
    使用集合工具类Collections工具类中的方法
    static void shuffle(List<?> list)随机打乱集合中元素的顺序
    3.发牌：
    一人17张牌，剩余3张作为底牌。一人一张轮流发牌（集合的索引%3）
    定义4个集合存储3个玩家的牌和底牌
    索引%3有三个值（0,1,2）
    索引>=51，给底牌发牌
    4.看牌
    直接打印集合
 */

import java.util.ArrayList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的集合，泛型使用String
        ArrayList<String> poker= new ArrayList<>();
        //定义两个数组，一个存储花色， 一个存储数字编号
        String[]colors={"♠","♥","♣","♦"};
        String[]numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王和小王存储到集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组，组装52张牌
        /*for (int i = 0; i < colors.length; i++) {
            for (int i1 = 0; i1 < numbers.length; i1++) {
                poker.add(colors[i]+numbers[i1]);
            }
        }*/
        //使用增强for
        for (String str1:colors) {
            for (String str2:numbers) {
                poker.add(str1+str2);
            }
        }
        //验证准备牌是否成功
        //System.out.println(poker);

        //2.洗牌 Collections中的shuffle
        Collections.shuffle(poker);
        //System.out.println(poker);

        //3.发牌
        //定义4个集合存储玩家的牌和底牌
        ArrayList<String> player0=new ArrayList<>();
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> rest=new ArrayList<>();
        //遍历poker集合，获取每一张牌，使用poker集合的索引%e给三个玩家轮流发牌，剩余三张牌给底牌
        //此处不能使用增强for,增强for没有索引
        for (int i = 0; i < poker.size(); i++) {
            if(i>=51){
                //给底牌发牌
                rest.add(poker.get(i));
            }
            else if(i%3==0){
                //给玩家0发牌
                player0.add(poker.get(i));
            }
            else if(i%3==1){
                //给玩家1发牌
                player1.add(poker.get(i));
            }
            else{
                //给玩家2发牌
                player2.add(poker.get(i));
            }

        }
        //4.看牌
        System.out.println("player0:"+player0);
        System.out.println("player1:"+player1);
        System.out.println("player2:"+player2);
        System.out.println("rest:"+rest);

    }
}
