package 抽象类进阶;



public class Demo01Main {
    public static void main(String[] args) {
        /*Animal animal =new Animal() {
            @Override
            public void sleep() {
                System.out.println("yingyingying");
            }

            @Override
            public void eat() {
                System.out.println("miemiemie");

            }
        };*/
       /* Dog dog=new Dog() {
            @Override
            public void sleep() {
                System.out.println("yinginyginyg");

            }
        };
        dog.eat();
        dog.sleep();*/
       DogGolden dogGolden=new DogGolden();
       dogGolden.sleep();
       dogGolden.eat();
    }
}
