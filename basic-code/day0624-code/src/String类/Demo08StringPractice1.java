package String类;
/*
问题描述：
定义一个方法，将数组[1,2,3]按照指定格式拼接成一个字符串，格式参照：[word1#word2#word3]
 */

public class Demo08StringPractice1 {
    public static void main(String[] args) {
        int[]array={1,2,3};
        String src=pinjie(array);
        System.out.println(src);

    }
    public static String pinjie(int[] array){
        String str="[";


        for (int i = 0; i < array.length; i++) {

            if(i==array.length-1)
            {
                str+="word"+array[i]+"]";
            }
            else{
                str+="word"+array[i]+"#";

            }



        }
        return str;

    }
}
