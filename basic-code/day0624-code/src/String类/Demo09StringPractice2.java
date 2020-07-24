package String类;
/*题目要求
键盘输入一个字符串，并且统计其中各种字符出现的次数
 */

import java.util.Scanner;

public class Demo09StringPractice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String input=sc.next();

        int countNum=0;
        int countUpper=0;
        int countLower=0;
        int countOther=0;

        char[]array=input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char ch=array[i];
            if(ch>='0'&&ch<='9'){
                countNum++;
            }
            else if(ch>='A'&&ch<='Z'){
                countUpper++;

            }
            else if(ch>='a'&&ch<='z'){
                countLower++;
            }
            else{
                countOther++;
            }

        }
        System.out.println("大写："+countUpper);
        System.out.println("小写："+countLower);
        System.out.println("数字"+countNum);
        System.out.println("其他"+countOther);


    }
}
