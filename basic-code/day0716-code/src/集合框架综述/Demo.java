package 集合框架综述;
/*
    学习集合的目标：
        1.会使用集合存储数据
        2.会遍历集合，把数据取出来
        3.掌握每种集合的特性
    集合框架的学习方式：
    1.学习顶层：学习顶层接口/抽象类中共有的方法，所有的子类都可以使用
    2.使用底层：底层不是接口就是抽象类，无法创建对象使用，需要使用底层的子类创建对象来使用
    老父亲接口：Collection接口
    儿子接口：List接口 Set接口（继承Collection接口）
    孙子实现类：Vector集合 ArrayList集合 LinkedList集合（List接口的实现）
               TreeSet集合 HashSet集合（Set接口的实现）
    重孙子实现类：LinkedHashSet集合（继承HashSet）

    Collection接口：
    1.定义的是所有单列集合中共性的方法
    2.所有的单列集合都可以使用共性的方法
    3.没有带索引的方法

    List集合：
    1.有序的集合（存储和取出元素顺序相同）
    2.允许存储重复的元素
    3.有索引，可以使用普通的for循环遍历

    Set集合：
    1.不允许存储重复元素
    2.没有索引，不能使用普通的for循环遍历

    TreeSet集合和HashSet集合:
    3.无序的集合，存储和取出元素的顺序有可能不一样

    LinkedHashSet集合：
    3.有序的集合，存储和取出元素的顺序一样













 */

public class Demo {
}
