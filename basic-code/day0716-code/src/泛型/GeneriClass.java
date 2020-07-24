package 泛型;
/*
    定义一个含有泛型的类，模拟ArrayList集合
    泛型是一个未知的数据类型，当我们不确定是什么数据类型的时候，可以使用泛型
    泛型可以接受任意的数据类型，可以有Integer String Student等
    创建对象的时候确定泛型的数据类型
 */

public class GeneriClass<E> {//所有使用数据类型的地方都改成泛型E
    private E name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public E getName() {
        return name;

    }

    public void setName(E name) {
        this.name = name;
    }
}
