package 父子类构造方法访问特点;

public class Zi extends Fu {
    public Zi(){
        super(10);
        System.out.println("子类构造方法");
    }
}
