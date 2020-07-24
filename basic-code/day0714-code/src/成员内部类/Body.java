package 成员内部类;

public class Body {//外部类
    //外部类的成员变量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Heart{//成员内部类：定义在方法的外边，直接在类当中
        public void beat(){
            System.out.println("心脏跳动，蹦蹦蹦");
            System.out.println("我叫"+name);//可以访问外部类的成员变量
        }


    }
    public void methodBody(){
        Heart heart =new Heart();
        heart.beat();//new Heart().beat();
        System.out.println("外部类的方法");
    }
}
