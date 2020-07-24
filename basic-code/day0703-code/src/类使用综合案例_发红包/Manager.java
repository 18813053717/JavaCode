package 类使用综合案例_发红包;

import java.util.ArrayList;

public class Manager extends User{


    public Manager(){
            //super();

        }
        public Manager(String name, int money) {
            super(name, money);
        }
    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存放若干个红包的金额
        ArrayList<Integer> redList=new ArrayList<>();

        //首先看群主有多少钱
        int leftmoney=super.getMoney();
        //大小判断
        if(totalMoney>leftmoney){
            System.out.println("余额不足");
            return redList;
        }
        //扣钱，重新设置余额
        super.setMoney(leftmoney-totalMoney);

        //发红包需要平均拆分成count份
        int avg=totalMoney/count;
        int mod=totalMoney%count;//零头
        //剩下的零头包在最后一个红包当中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);

        }
        int last=avg+mod;
        redList.add(last);
        return redList;
    }
}
