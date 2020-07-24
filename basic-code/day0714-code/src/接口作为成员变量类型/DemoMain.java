package 接口作为成员变量类型;



public class DemoMain {
    public static void main(String[] args) {
        Hero hero =new Hero();
        hero.setName("德玛");
        hero.setSkill(new Skill() {//同时使用匿名内部类和匿名对象
            @Override
            public void use() {
                System.out.println("biubiubiu");
            }
        });
        hero.attack();

    }
}
