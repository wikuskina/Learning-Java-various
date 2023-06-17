package Homework4;

public class Fish implements WaterAction{

    @Override
    public void MoveInWater(){
        Eat();
        System.out.println("I am a fish and I sail once I have eaten.");
    }

    private void Eat(){
        System.out.println("I am a fish and I eat first.");
    }
}
