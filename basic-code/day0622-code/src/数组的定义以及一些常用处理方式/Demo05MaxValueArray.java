package 数组的定义以及一些常用处理方式;

public class Demo05MaxValueArray {
    public static void main(String[] args) {
        int[]array={1,5,7,8,3,4};
        int max=arrayMaxCompare(array);
        System.out.println("最大值为："+max);

    }
    //定义一个方法求数组元素的最大值
    public static int arrayMaxCompare(int[]array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){//如果当前元素比max要大，则用当前元素取代max
                max=array[i];
            }
        }
        return max;

    }
}
