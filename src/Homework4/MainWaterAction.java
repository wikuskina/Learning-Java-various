package Homework4;

public class MainWaterAction {
    public static void main(String[] args){
        Fish fish = new Fish();
        Ship ship = new Ship();

        StartWaterAction startWaterAction = new StartWaterAction();

        startWaterAction.ActionStarted(fish);
        startWaterAction.ActionStarted(ship);
    }
}
