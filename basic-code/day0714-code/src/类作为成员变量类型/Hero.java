package 类作为成员变量类型;
/*
游戏当中的英雄角色名
 */

public class Hero {

    private String name ;//英雄名称
    private Weapon weapon;
    private int age ;

    public void attack(){
        System.out.println("年龄为"+age+"的"+name+"正在使用"+weapon.getCode());
    }

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
