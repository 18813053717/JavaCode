package System类;



import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
        demo01();
        demo02();

    }



    /*
        public static long currentTimeMillis():返回以ms为单位的当前时间
        用来验证程序的效率
     */
    private static void demo01() {
        Long start_time=System.currentTimeMillis();
        System.out.println(start_time);

        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);

        }

        Long end_time=System.currentTimeMillis();
        System.out.println(end_time);
        System.out.println("程序占用时间为："+(end_time-start_time)+"ms");


    }
    /*
        public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
        src:源数组
        srcPos:源数组中的起始位置
        dest:目标数组
        destPos:目标数组中的起始位置
        length:长度

     */
    private static void demo02(){
        int[] src={1,2,3,4,5,6};
        int[] dest={5,6,7,8,9,0};
        System.out.println("复制前："+Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+Arrays.toString(dest));
    }
}
