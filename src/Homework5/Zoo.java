package Homework5;

public class Zoo {

    public static void main(String[] args) {

        Zookeeper zookeeper =  new Zookeeper();

        Cow cow  = new Cow();
        Tiger tiger = new Tiger();
        Fish fish = new Fish();

        zookeeper.makeVoice(cow); // исполняются методы
        zookeeper.makeWalk(cow);


    }
}
