package Homework5;

public class Tiger extends AbstractAnimal {

    @Override

    void voice() {

        System.out.println("I am tiger and I roar.");
    }

    @Override

    void walk() {

        super.walk(); // расширение функционала метода walks
        System.out.println("I am tiger and I can run.");
    }
}
