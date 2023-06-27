package RandomBegin;

public class Airplane implements Flyable{

    @Override
    public void fly() {
        fuel();
        System.out.println("I am a plane and I fly!");
    }

    private void fuel(){
        System.out.println("I am a plane and I need to refuel.");
    }
}
