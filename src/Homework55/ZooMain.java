package Homework55;

public class ZooMain {
    public static void main(String[] args) {

        Action action = new Action();

        Swan swan = new Swan();
        Wolf wolf = new Wolf();

        action.living(swan);
        action.liking(swan);
        action.eating(swan);

        action.living(wolf);
        action.liking(wolf);
        action.eating(wolf);


    }
}
