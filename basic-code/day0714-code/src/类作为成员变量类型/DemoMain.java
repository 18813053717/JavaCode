package 类作为成员变量类型;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero =new Hero();
        //为英雄起一个名字，并且设置年龄
        hero.setName("盖伦");
        hero.setAge(20);

        //创建一个武器对象
        Weapon weapon =new Weapon("无尽之刃");
        //为英雄配备武器
        hero.setWeapon(weapon);
        hero.attack();


    }
}
