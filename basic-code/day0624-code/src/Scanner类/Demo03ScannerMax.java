package Scanner类;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]array=new int[3];
        System.out.println("请输入第一个数字：");
        array[0]=sc.nextInt();
        System.out.println("请输入第二个数字：");
        array[1]=sc.nextInt();
        System.out.println("请输入第三个数字：");
        array[2]=sc.nextInt();
        int max=array[0];
        int index=0;
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
                index=i;
            }
        }
        System.out.println("三个数字中最大的数字为："+max+",它的索引号为："+index);
    }
}
