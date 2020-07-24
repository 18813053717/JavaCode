package 接口作为成员变量类型;

public class Hero {
    private String name;//英雄的名称
    private Skill skill;//英雄的技能

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }
    public void attack(){
        System.out.println("我叫"+name+"开始释放技能");
        skill.use();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
