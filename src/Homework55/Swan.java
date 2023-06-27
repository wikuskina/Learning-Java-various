package Homework55;

public class Swan extends AbstractAnimal {

    @Override
    void eat() {
        System.out.println("I am swan and I eat seeds.");
    }

    ;

    void like() {
        System.out.println("I am swan and I like to swim.");

    }

    void live() {

        super.live();
        System.out.println("I am a swan don't like to live in the zoo...");
    }
}
