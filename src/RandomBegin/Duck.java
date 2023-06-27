package RandomBegin;

public class Duck implements Flyable{

    @Override
    public void fly() {
        eat();
        System.out.println("I am a duck and I fly!");
    }

    private void eat(){
        System.out.println("I am a duck and I need to eat.");

    }

}
