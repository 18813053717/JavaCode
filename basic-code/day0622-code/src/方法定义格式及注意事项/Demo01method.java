package 方法定义格式及注意事项;

public class Demo01method {
    public static void main(String[] args) {
        matrix();
    }
    public static void matrix(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }



}
