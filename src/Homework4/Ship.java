package Homework4;

public class Ship implements WaterAction{

    @Override
    public void MoveInWater(){
        Sail();
        System.out.println("I am a ship and I sail once I fuelled.");
    }

    private void Sail() {
        System.out.println("I am a ship and I fuel first.");
    }
}
