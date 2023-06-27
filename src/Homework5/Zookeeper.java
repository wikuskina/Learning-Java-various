package Homework5;

public class Zookeeper {

    void makeVoice(AbstractAnimal abstractAnimal){  // передали обьект типа AbstractAnimal
      abstractAnimal.voice();

    }

    void makeWalk(AbstractAnimal abstractAnimal){ // в эти методы можно передать экзепляр любого из классов (e.g. cow)
        abstractAnimal.walk();
    }
}
