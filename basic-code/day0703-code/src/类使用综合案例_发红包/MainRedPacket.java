package 类使用综合案例_发红包;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        //设置群主的名字和金钱数目
        Manager manger=new Manager("群主",100);
        //设置群员的名字和金钱数目
        Member one=new Member("A",0);
        Member two=new Member("B",0);
        Member three=new Member("C",0);
        manger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===========");
        ArrayList<Integer> redlist=manger.send(20,3);
        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);
        manger.show();
        one.show();
        two.show();
        three.show();

    }
}
