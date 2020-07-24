package 方法定义练习三例子;
/*
要求：
定义一个方法，用来判断两个数字是否相同。
*/
public class Demo02MethodSame {
    public static void main(String[] args) {
        boolean result=isSame(5,5);
        System.out.println(result);

    }
    public static boolean isSame(int a,int b){
       /* if(a==b){
            return true;
        }
        else{
            return false;
        }*/

       return a==b;


    }
}
