package Random类;
/*
题目：代码模拟猜数字的游戏
思路：
1.首先产生一个随机数字，并且一旦产生就不再变化，用Random的nextInt方法
2.需要键盘输入，用到了Scanner，获取键盘输入的数字，用Scanner当中的nextInt方法
3.已经得到了两个数字，if一下，三种情况：
    如果太大了，给提示太大，并且重试
    如果太小了，给提示太大，并且重试
    如果猜中了，游戏结束
4.重试就是再来一次，但循环次数不确定
 */
import java.util.Random;
import java.util.Scanner;

public class Demo03RandomPractice2 {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int setnum=r.nextInt(100)+1;//1-100之间的数字

        /*while(true){
            System.out.println("请输入一个数字：");
            int num=sc.nextInt();
            if(n==num){
                System.out.println("恭喜猜对了");
                break;
            }
            else if(n<num){
                System.out.println("大了");
            }
            else {
                System.out.println("小了");

            }*/
        int index=0;
        for (int i = 0; i < 10; i++) {

            System.out.println("请输入一个数字：");
            int guessnum=sc.nextInt();
            index++;
            if(setnum==guessnum){
                System.out.println("第"+index+"次就猜中了");
                break;
            }
            if(setnum>guessnum){
                System.out.println("小了，还有"+(10-index)+"次机会");

            }
            if(setnum<guessnum){
                System.out.println("大了，还有"+(10-index)+"次机会");
            }
            if(index==10){
                System.out.println("您的次数已经用完");
            }



        }
    }
}
