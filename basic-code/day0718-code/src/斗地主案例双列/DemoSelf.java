package 斗地主案例双列;
/*
    具体规则：
    1.组成54张扑克牌
    2.54张牌顺序打乱
    3.三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张牌留作底牌
    4.查看三人各自手中的牌（按照牌的大小顺序排序），底牌
 */

import java.util.*;
import java.util.concurrent.Callable;

public class DemoSelf {
    public static void main(String[] args) {

        //创建一个HashMap集合用来存储键值对，键：牌的索引，值：牌
        HashMap<Integer,String> poker=new HashMap<Integer, String>();
        //创建一个Arraylist集合存储牌的的索引
        ArrayList<Integer> indexs =new ArrayList<>();
        //创建索引优先存储大小王
        int index=0;
        poker.put(index,"大王");
        indexs.add(index);//存储键值对的同时也存储索引
        index++;
        poker.put(index,"小王");
        indexs.add(index);
        index++;
        //创建两个数组来存储花色和数值
        String[]color={"♠","♦","♣","♥"};
        String[]nums={"2","A","k","Q","J","10","9","8","7","6","5","4","3"};
        //嵌套循环遍历两个数组生成52张牌
        for (String num : nums) {
            for (String s : color) {
                poker.put(index,s+num);
                indexs.add(index);
                index++;
            }
        }
        System.out.println(poker);//打印HashMap集合看牌是否准备好
        System.out.println(indexs);//打印存放索引集合

        //打乱索引排序
        Collections.shuffle(indexs);
        //查看打乱后的索引
        //System.out.println(indexs);

        //创建4个集合存储获得的索引值
        ArrayList<Integer> one =new ArrayList<>();
        ArrayList<Integer> two =new ArrayList<>();
        ArrayList<Integer> three =new ArrayList<>();
        ArrayList<Integer> rest =new ArrayList<>();

        for (int i = 0; i < indexs.size(); i++) {
            if(i>=51){
                Integer it = indexs.get(i);//获取牌的索引值
                rest.add(it);//存储牌的索引值到集合中
                //rest.add(indexs.get(i));
            }
            else if(i%3==0){
                one.add(indexs.get(i));
            }
            else if(i%3==1){
                two.add(indexs.get(i));
            }
            else{
                three.add(indexs.get(i));
            }
        }

        //每个集合都拿到了牌的索引，需要对索引进行排序
        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);
        Collections.sort(rest);

        //看牌
        showmepower("1号玩家",one,poker);
        showmepower("2号玩家",two,poker);
        showmepower("3号玩家",three,poker);
        showmepower("left",rest,poker);



    }
    //定义一个看牌的方法
    public static void showmepower(String name,ArrayList<Integer> list,HashMap<Integer,String> map){

        System.out.print(name+"： ");
        for (Integer it : list) {//取出索引集合中的所有元素
            System.out.print(map.get(it)+" ");//打印输出索引对应的牌面
        }
        System.out.println();

    }




}

